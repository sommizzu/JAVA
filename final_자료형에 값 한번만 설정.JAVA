public class Sample {
    public static void main(String[] args) {
        final int n = 123;  // final 로 설정하면 값을 바꿀수 없다.
        n = 456;  // 컴파일 에러 발생
    }
}