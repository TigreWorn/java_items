public class reference{
    public static int linear(String animals[], String key){
        for (int i=0; i<animals.length; i++) {
            if (animals[i]==key)
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        String animals[] = {"dog", "cat", "wolf", "lion"};
        String key = "wolf";
        int index = linear(animals, key);
        if (index==-1){
            System.out.println("not there");
        }
        else{
            System.out.println(index);
        }
    }
}
