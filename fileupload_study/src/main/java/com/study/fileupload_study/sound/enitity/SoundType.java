package com.study.fileupload_study.sound.enitity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum SoundType {
    PIANO, VOCAL, ELEC_GUITAR, BASE, GUITAR;

    private int info;
}
