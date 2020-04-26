package com.example.finalproject.logic;
//import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Grid {
    public String fileName;
    public int columns;
    public int rows;

    public void SplitImage(String setFileName, int setRows, int setColumns) {
        fileName = setFileName;
        columns = setColumns;
        rows = setRows;

        //https://gist.github.com/madan712/3672616
        public static void main (String[]args){
            try {

                //Provide number of rows and column
                int row = 4;
                int col = 3;
                File file = new File(fileName);
                Image image = new Image(file.toURI().toString());
                imageView = new ImageView(image);

                BufferedImage originalImgage = ImageView;

                //total width and total height of an image
                int Width = originalImgage.getWidth();
                int Height = originalImgage.getHeight();

                System.out.println("Image Dimension: " + Width + "x" + Height);

                //width and height of each piece
                int eWidth = Width / col;
                int eHeight = Height / row;

                int x = 0;
                int y = 0;

                for (int i = 0; i < row; i++) {
                    y = 0;
                    for (int j = 0; j < col; j++) {
                        try {
                            System.out.println("creating piece: " + i + " " + j);

                            BufferedImage SubImage = originalImgage.getSubimage(y, x, eWidth, eHeight);
                            File outputfile = new File(fileName + i + j + ".jpg");
                            ImageIO.write(SubImage, "jpg", outputfile);

                            y += eWidth;

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    x += eHeight;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}



    //Read more: https://javarevisited.blogspot.com/2011/12/read-write-image-in-java-example.html#ixzz6K07Fhsaj
        //try is used to make sure program won't crash even if exception is spotted
//    @Override
//    public void onCreate(final Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState); // Required by Android
//        setContentView(R.layout.activity_new_game);
//    }

//        public static void main(String[]args){
//
//            //BufferedImage image = null;
//            //image = ImageIO.read(new File(fileName));
//            try {
//                ImageView image = (ImageView) findViewById(R.id.test_image);
//                Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
//                image.setImageBitmap(bMap);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


}


