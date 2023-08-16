package core.sample.hw.board.controller.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

/**
 * @since       2023.08.16
 * @author      jerry
 * @description board create
 **********************************************************************************************************************/
@Getter
public class BoardCreate {

    @NotBlank
    private String title;

    @NotBlank
    private String content;
}
