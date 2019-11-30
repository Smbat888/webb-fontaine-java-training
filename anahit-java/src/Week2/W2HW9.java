package Week2;

public class W2HW9 {

    public static void main(String[] args) {
        int x = 0;
        int[] finalarray=new int[10];

        int[] array= new int[10];
        for (int i=0; i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]  + " ");
        }


        int[] array2= new int[10];
        for (int i=0; i<array2.length;i++){
            array2[i]=(int)(Math.random()*100);
        }
        for(int i=0; i<array2.length;i++){
            System.out.println(array2[i]+ " ");
        }
        for (int i=0; i<array.length;i++) {
            for (int j = i; j < array2.length; j++)

                if (array[i] ==array2[j]){
                    finalarray[x]=array[i];

        System.out.println(finalarray[x]);
                        x++;}
}
}}