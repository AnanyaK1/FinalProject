package com.example.finalproject.logic;
//import javax.imageio.ImageIO;

//import java.awt.image.BufferedImage;



public class Grid {
    public String fileName;
    public int columns;
    public int rows;

    public void SplitImage(String setFileName, int setRows, int setColumns) {
        fileName = setFileName;
        columns = setColumns;
        rows = setRows;
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


