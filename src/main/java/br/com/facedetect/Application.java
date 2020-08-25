package br.com.facedetect;

import br.com.facedetect.service.FaceDetectorService;

public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class,args);
        FaceDetectorService.iniciarCriacao();
    }
}
