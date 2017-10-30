package com.string;

import java.util.Stack;

/**
 * ջ��Ӧ�ã�����������ʽ��ֵ
 * @author �߷�˧��
 * @date 2016.7.20
 */
public class InfixToPost {
    private Stack<String> stack;  //��׺���ʽת��Ϊ��׺���ʽ����Ҫ��ջ
    private String infix;    //�������׺���ʽ
    private String post = "";     //�洢�õ��ĺ�׺���ʽ
 
    //��ʼ��������
    public InfixToPost(Stack<String> stack, String infix) {
        this.stack = stack;
        this.infix = infix;
    }
 
    /**
     * 
     * @param infix �������׺���ʽ
     * @return  ���ش���������׺���ʽ����Ҫ�����������׺���ʽ�ӿո�
     * ���磺�������׺���ʽΪ��9+(3-1)*3+10/2
     *     �������׺���ʽΪ��9 + ( 3 - 1 ) * 3 + 10 / 2
     */
    private String processInfix(String infix) {
        String result = "";
        for (int i = 0; i < infix.length() - 1; i++) {
            char temp1 = infix.charAt(i);
            char temp2 = infix.charAt(i + 1);
            if (isDigital(temp1) && isDigital(temp2)) {
                result += temp1;
            } else {
                result += temp1 + " ";
            }
        }
        result += infix.charAt(infix.length() - 1); // �����һ��Ԫ����ӽ�ȥ
        return result;
    }
 
    private boolean isDigital(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        else
            return false;
    }
 
    //��ǰ׺���ʽת��Ϊ��׺���ʽ�Ĵ������
    public void process() {
        String[] strArr = processInfix(infix).split(" ");
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            switch (str) {
            case "+":
            case "-":
                getOperation(str, 1);
                break;
            case "*":
            case "/":
                getOperation(str, 2);
                break;
            case "(":
                stack.push(str);
                break;
            case ")":
                getParent();
                break;
            default:
                post += " " + str;
                break;
            }
        }
        // ����ȫ���������Ҫ���ջ��ʣ��ķ���
        while (!stack.isEmpty()) {
            post += " " + stack.pop();
        }
    }
 
    private void getParent() {
        while (!stack.isEmpty()) {
            String top = stack.pop();
            if (top.equals("(")) {
                break;
            } else {
                post += " " + top;
            }
        }
    }
 
    private void getOperation(String str, int priority) {
        while (!stack.isEmpty()) {
            String top = stack.pop();
            if (top.equals("(")) {
                stack.push(top);
                break;
            } else {
                int priTop = getPriority(top);
                if (priTop < priority) {
                    stack.push(top);
                    break;
                } else {
                    post += " " + top;
                }
            }
        }
        stack.push(str);
    }
 
    private int getPriority(String str) {
        int pri = 0;
        if (str.equals("+") || str.equals("-")) {
            pri = 1;
        } else {
            pri = 2;
        }
        return pri;
    }
 
    public String getPost() {
        return post.trim();
    }
 
    public static void main(String[] args) {
 
        Stack<String> stack = new Stack<String>();
        String input = "9+(3-1)*3+10/2";
        InfixToPost infix = new InfixToPost(stack, input);
        infix.process();
 
        String post = infix.getPost();
        Stack<Integer> stack_result = new Stack<Integer>();
        PostToResult ptr = new PostToResult(post, stack_result);
        ptr.operate();
        System.out.println(ptr.getResult());
    }
}


class PostToResult{
    private String post;   //��׺���ʽת���õ��ĺ�׺���ʽ
    private Stack<Integer> stack;   //���ڵõ���������ջ
 
    public PostToResult(String post, Stack<Integer> stack) {
        this.post = post;
        this.stack = stack;
    }
 
    //�ɺ�׺���ʽ�õ�������������ʵ�ֹ���
    public void operate(){
        String[] strArr = post.split(" ");
        for(int i = 0; i < strArr.length; i++){
            String temp = strArr[i];
            if(isDigital(temp)){
                stack.push(Integer.valueOf(temp));
            }else{
                int result = compute(temp);
                stack.push(result);
            }
        }
    }
 
    private int compute(String str){
        int re = 0;
        int m = stack.pop();
        int n = stack.pop();
        switch(str){
        case "+" :
            re = n + m;
            break;
        case "-" :
            re = n - m;
            break;
        case "*" :
            re = n * m;
            break;
        case "/" :
            re = n / m;
            break;
        default :
            break;
        }
        return re;
    }
 
    private boolean isDigital(String str){
        char[] chArr = str.toCharArray();
        int len = chArr.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(chArr[i] >= '0' && chArr[i] <= '9')
                count++;
        }
        return count == len;
    }
 
    public int getResult() {
        return stack.pop();
    }
}