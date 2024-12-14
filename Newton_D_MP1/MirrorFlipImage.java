/* 
Name: Divi Newton
Student ID: 2440117
Chapman Email: dnewton@chapman.edu
Course number and section: CPSC-231-02
Assignment number: MP1: Mirror Flip Image
 */

class MirrorFlipImage {
    public static void main(String[] args) { // main method
        char[][] image = {
            {'#', 'x', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', 'E', ' ', '#'},
            {'*', ' ', ' ', ' ', '|'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', '#', '#', 'y', '#'},
        }; // creates 2D image array with given values
        System.out.println("Original image:");
        displayImage(image); // calls displayImage to print array in terminal

        char[][] horizontalImage = horizontalMirror(image); // calls horizontalMirror and puts in original image
        System.out.println("\nHorizontally flipped image:");
        displayImage(horizontalImage); // calls displayImage to print the newly made image in the terminal

        char[][] verticalImage = verticalMirror(image); // calls verticleMirror and puts in original image
        System.out.println("\nVertically flipped image:");
        displayImage(verticalImage); // calls displayImage to print the newly made image in the terminal

        char[][] finalImage = verticalMirror(horizontalImage); // calls verticalMirror to mirror the horzontally mirrored image
        System.out.println("\nHorizontally and then Vertically flipped image:");
        displayImage(finalImage); // calls displayImage to print the newly made image in the terminal
    }

    private static void displayImage(char[][] image) { // displayImage method prints the inputted image in the terminal
        for(int row = 0; row < image.length; row++){ // iterates through every row
            for (int column = 0; column < image[0].length; column++){ // iterates through every column in the row
                System.out.print(image[row][column] + " "); // prints the value
            }
            System.out.println(); // goes to next line
        }
    }

    private static char[][] horizontalMirror(char[][] image) { // horizontalMirror method takes in an image and flips it
        char[][] newImage = new char[image.length][image[0].length]; // creates a new array with the same dimensions as the old one
        for (int row = 0; row < image.length; row++) { // iterates through every row
            for (int column = 0; column < image[row].length; column++) { // iterates through every column in the row
                newImage[newImage.length - row - 1][column] = image[row][column]; // adds these values to the new array in flipped order
            }
        }
        return newImage; // returns the new image
    }

    private static char[][] verticalMirror(char[][] image){ // verticleMirror method takes in an image and flips it
        char[][] newImage = new char[image.length][image[0].length]; // creates a new array with the same dimensions as the old one
        for (int row = 0; row < image.length; row++) { // iterates through every row
            for (int column = 0; column < image[row].length; column++) { // iterates through every column in the row
                newImage[row][newImage[row].length - column - 1] = image[row][column]; // adds these values to the new array in flipped order
            }
        }
        return newImage; // returns the new image
    }
}