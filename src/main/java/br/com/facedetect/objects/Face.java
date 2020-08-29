package br.com.facedetect.objects;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Face {
    private Size eye;
    private Size nose;
    private Size mouth;
    private int leftMouth;
    private int topNose;
    private int downNose;
    private int leftNose;
    private int distanceEye;
}
