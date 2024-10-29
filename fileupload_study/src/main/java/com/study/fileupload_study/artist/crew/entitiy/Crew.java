package com.study.fileupload_study.artist.crew.entitiy;

import com.study.fileupload_study.artist.Artist;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@SuperBuilder
@Table(name = "crews")
public class Crew extends Artist {

}
