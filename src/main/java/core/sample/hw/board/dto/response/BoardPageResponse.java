package core.sample.hw.board.service.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * @since       2023.08.16
 * @author      jerry
 * @description board page response
 **********************************************************************************************************************/
@Getter
public class BoardPageResponse {

    private final Long id;

    private final String title;

    private final String content;

    private final LocalDateTime createdDateTime;

    @Builder
    public BoardPageResponse(Long id, String title, String content, LocalDateTime createdDateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdDateTime = createdDateTime;
    }
}
