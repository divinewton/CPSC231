class MidtermReview{
    public static void main(String[] args) {
        int[][] numSum = new int[2][2];
        numSum[0][0] = 2;
        for (int col = 0; col < numSum.length; col++) {
            for (int row = 0; row < numSum[col].length; row++) {
                System.out.println(numSum[col][row]);
            }
        }
        String fruit = "apple";
        System.out.println(fruit);
        for (int letter = 0; letter < fruit.length(); letter++) {
            System.out.println(fruit.charAt(letter));
        }
        fruit.replace('p', 'b');
        System.out.println(fruit);

        int num1 = 2;
        int num2 = 5;
        System.out.println(sumNum(num1, num2));
    }
    private static int sumNum(int num1, int num2) {
        return num1 + num2;
    }
}