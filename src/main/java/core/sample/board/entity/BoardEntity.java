package core.sample.board.entity;

import core.sample.common.entity.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

/**
 * @since       2023.08.07
 * @author      jerry
 * @description board
 **********************************************************************************************************************/
@Getter
@Entity
public class BoardEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 255)
    private String content;
}
