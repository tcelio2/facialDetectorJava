package br.com.facedetect.service;

import br.com.facedetect.objects.Face;
import br.com.facedetect.objects.Size;

public class FaceDetectorService {


    private static int topNose;
    private static int downNose;
    private static int narizX;
    private static int narizY;

    private static int leftNose;

    private static int mouthY;

    private static int eyeX;
    private static int distanceEye;
    
    private static int distanceEyeOriginal;

    private static int faceX;
    private static int faceY;

    private static int olhoXLeft;
    private static int olhoXRight;
    private static int olhoYLeft;
    private static int olhoYRight;
    
    private static int olhoXOriginal;
    private static int olhoYOriginal;

    static {

        Size build = Size.builder().x(2).y(2).build();
        Size build2 = Size.builder().x(4).y(2).build();
        Face face = Face.builder().eye(build).nose(build).mouth(build2).topNose(3)
                .downNose(1).leftNose(2).distanceEye(2).build();

        topNose = face.getTopNose();
        narizY = face.getNose().getY();
        narizX = face.getNose().getX();
        downNose = face.getDownNose();
        mouthY = face.getMouth().getY();

        leftNose = face.getLeftNose();

        eyeX = 2 * face.getEye().getX();
        distanceEye = face.getDistanceEye();
        distanceEyeOriginal = face.getDistanceEye();

        faceX = eyeX + distanceEye;
        faceY = topNose + narizY + downNose + mouthY;

        olhoXOriginal = face.getEye().getX();
        olhoYOriginal = face.getEye().getY();
        
        olhoXLeft = face.getEye().getX();
        olhoXRight = face.getEye().getX();
        olhoYLeft = face.getEye().getY();
        olhoYRight = face.getEye().getY();
    }

    public static void iniciarCriacao() {
        //Face test = new Face();
        //verifcar se face é valida
        //olhos
        //nariz
        //boca
        System.out.println(faceX+"-"+faceY);
        for (int i = 0; i < faceY; i++) {
            for (int j = 0; j < faceX; j++) {
                if(topNose > 0) {
                    verificarOlho();
                } else if(topNose == 0 && downNose > 0) {
                    verificarNariz();
                } else if(topNose == 0 && downNose == 0) {
                    print("1");
                } else if(olhoYLeft == 0 && topNose > 0 ){
                    print("0");
                } else if(topNose == 0 && downNose > 0){
                    print("0");
                }
            }
            if(olhoYLeft > 0) {
            	olhoYLeft--;
            	olhoXLeft = olhoXOriginal;
            	distanceEye = distanceEyeOriginal;
            }
            if(olhoYRight > 0) {
            	olhoYRight--;
            	olhoXRight = olhoYOriginal;
            	distanceEye = distanceEyeOriginal;
            }
            if(topNose > 0) topNose--;
            if(topNose == 0 && downNose > 0) downNose--;
            print("\n");
        }
    }

    private static void verificarNariz() {
        if(leftNose == 0 && narizX > 0) {
            print("1");
            narizX--;
            if(narizX == 0) narizY--;
        }
        if(leftNose > 0 ) {
            print("0");
            leftNose--;
        }
    }

    private static void verificarOlho() {
    	if(olhoYLeft > 0) {
    		
    		if(olhoXLeft > 0) {
    			print("1");
    			olhoXLeft--;
    		} 
    		if(olhoXLeft == 0 && distanceEye > 0 ) {
    			print("0");
    			distanceEye--;
    		}
    		if((olhoXRight > 0 && olhoXLeft == 0) && distanceEye == 0) {
    			print("1");
    			olhoXRight--;
    		} 
    		
    		
    	} else {
    		print("0");
    	}
    }

    private static void print(String print) {
        System.out.printf(print);
    }



}
