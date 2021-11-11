package Homework.brackeChecker;

import lesson10.Stack;

public class BrackeChecker {
    //    սա հենց տեքստն է
    private String text;

    //    կլասսի կոնստրուկտորն է,որ պետք է ընդունի String տիպի տեքստ և վերագրի վերևի տեքստին
    //    Որ չկարողանանք BraceChecker-ի օբյեկտը սարկենք առանց text-տալու կանստրուկտորի միջոցով
    public BrackeChecker(String text) {
        this.text = text;

    }

    //    սա հիմնական մեթոդն է ,որի մեջ գռելու ենք ամբողջ լոգիկան ․աշխատոլու ենք թե stack-ի հետ, թե վերևի text-ի հետ
    public void check() {
        char[] chars = text.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                case '[':
                case '{':
                    stack.push(chars[i]);
                    break;
                case '}':
                    char c = stack.pop();
                    if (stack.isEmpty()) {
                        System.out.println("Erroe there are not opened brackes");break;
                    } else if (c != '{') {
                        System.err.println("Error: opened " + c + " closed " + chars[i] + " " + i);
                    }
                    break;
                case ']':
                    char b = stack.pop();
                    if (stack.isEmpty()) {
                        System.out.println("Erroe there are not opened brackes");break;
                    } else if (b != '[') {
                        System.err.println("Error: opened " + b + " closed " + chars[i] + " " + i);
                    }
                    break;

                case ')':
                    char a = stack.pop();
                    if (stack.isEmpty()) {
                        System.out.println("Erroe there are not opened brackes");break;
                    }
                    else if (a != '(') {
                        System.err.println("Error: opened " + a + "closed " + chars[i] + " " + i);
                    }
                    break;
                default:
                    break;}}
        if (!stack.isEmpty()){
            System.out.println("There are not closed brackes");
        }else {
            System.out.println("The text is ok");
        }

    }
}



