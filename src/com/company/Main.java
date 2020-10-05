package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis in nibh venenatis, vulputate justo sit amet, feugiat tellus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ornare justo non lobortis varius. In finibus tortor eget tortor gravida euismod. Nam sit amet ipsum eu orci blandit tincidunt. Vestibulum aliquam euismod quam, et posuere nunc sollicitudin ac. Vivamus vel imperdiet sapien. Curabitur vitae viverra purus. Nunc tempus posuere tempus. Phasellus blandit ex eu turpis fringilla egestas. Sed ipsum sapien, egestas vitae odio ut, laoreet bibendum augue. Aliquam venenatis pretium eros at consequat. Donec volutpat, velit non ornare auctor, massa velit viverra augue, sed tristique enim nulla ac magna. Proin eget dui condimentum, placerat mauris vitae, elementum velit. Sed ultrices nisl non purus sagittis ultrices. Sed tincidunt ligula eget erat semper dapibus. Pellentesque fringilla lorem ut venenatis porttitor. Cras suscipit felis sem, vel tincidunt dolor pulvinar eget. Suspendisse sed ornare nulla, venenatis luctus sapien. Aliquam sagittis augue ligula, vitae sagittis elit gravida eget. Fusce eu elit non quam rutrum condimentum at ut augue. In quis condimentum ex. Pellentesque lacus mauris, accumsan ut sodales a, vehicula sed nisi. Suspendisse imperdiet nisi at cursus malesuada.";
        var textManipulator = new TextManipulator();
        textManipulator.ShowNumberOfWordsAndSentences(text);
        System.out.println("---------------------------------------------------");
        textManipulator.ShowNumberOfLettersVowelsAndConsonants(text);
        System.out.println("---------------------------------------------------");
        textManipulator.ShowTop5WordsAndLongestOne(text);
    }
}
