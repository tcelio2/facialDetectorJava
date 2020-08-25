package br.com.facedetect.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Size {

    private int x;
    private int y;
}
