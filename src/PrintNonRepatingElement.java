public class PrintNonRepatingElement {
    static void NonRepeating(int array[]){
        for(int i=0; i<=array.length;i++){
            int count=0;

            for(int j=0;j<array.length;j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }if(count==1){
                System.out.println(array[i]);
                //break;
            }
        }
    }
    public static void main(String[] args) {
        NonRepeating(new int [] {10, 20, 40, 30, 50, 20, 10, 20});

    }
}
