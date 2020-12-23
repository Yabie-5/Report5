public class Main {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("エラー:NullpointerExceptionが発生しました。\n"+ e.getMessage());
        }
    }
}