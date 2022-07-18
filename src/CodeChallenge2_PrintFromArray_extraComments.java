class CodeChallenge2_PrintFromArray_extraComments {
    public static void main(String[] args) {

    /*
    Create an array with seven items. Print the last 3 items.
    */

        String[] emojis = {"😃", "😀", "😄", "😁", "😆", "😊", "☺️"};

        System.out.println(emojis[5]);
        System.out.println(emojis[6]);
        System.out.println(emojis[4]);

        // Can use condition statement in for loop. Let i be counter -ok
        System.out.println("\n");

        for (int i = 0; i < emojis.length; i++) {

            if (i > 3) {

                System.out.println(emojis[i]);
            }
        }
    }
}