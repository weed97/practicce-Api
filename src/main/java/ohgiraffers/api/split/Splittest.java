package ohgiraffers.api.split;

import java.util.Arrays;

public class Splittest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";

        // 문자열분리
        String[] strArr= str.split(" ");
        System.out.println(Arrays.toString(strArr));
        // 문자 배열로 바꾸기
        // 1) 문자배열을 문자열배열 크기로 만들기
        char[] chArr = new char[strArr.length];

        // 2) 문자열배열의 값을 문자로 바꿔서, 문자배열에 값넣기
        for (int i = 0; i < strArr.length; i++) {
            chArr[i] = strArr[i].charAt(0);
        }
        System.out.println("문자배열 갯수 출력 : " + chArr.length);
        // 문자배열의 값이 잘들어갔는지 확인
        System.out.println("문자배열" + Arrays.toString(chArr));

        // 문자배열 -> 문자열

        System.out.println("가나다" + 'a' + 'b');
        String result ="";
//        for (char ch : chArr) {
//            result = result + ch;
//        }
//        System.out.println("result = " + result);


        String result2 = new String(chArr);

        // 대문자로 바꾸기
        result = result2.toUpperCase();
        System.out.println("result = " + result);
//        for (String s : strArr) {
//            System.out.println(s);
//        }

    }
}
