public class MothTester {
    public static void main(String [] args){
        Moth moth = new Moth(30);
        moth.moveToLight(80);

        System.out.println(moth.getPosition());
    }
}
