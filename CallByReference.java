public class CallByReference {
    public static void main(String[] args) {
        float a =56.7f;
        float b =78.9f;
        floatAdd(a,b); // call By Value
        System.out.println("종료");
    }
    //Q. 매개변수로 2개의 실수를 받아서 / 총합을 구하여 / 출력하는 / 메서드를 정의하세요
    public static void floatAdd(float a, float b){
        float hap=a+b;
        System.out.println("hap = " + hap);
        //return 리턴문은 값을 위로 전달 할 때 쓰는 용도
    }
}
