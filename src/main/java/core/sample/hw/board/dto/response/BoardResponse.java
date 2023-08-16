package core.sample.hw.board.service.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * @since       2023.08.16
 * @author      jerry
 * @description board response
 **********************************************************************************************************************/
@Getter
public class BoardResponse {

    private final Long id;

    private final String title;

    private final String content;

    private final LocalDateTime createdDateTime;

    private final LocalDateTime modifiedDateTime;

    @Builder
    public BoardResponse(Long id, String title, String content, LocalDateTime createdDateTime, LocalDateTime modifiedDateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdDateTime = createdDateTime;
        this.modifiedDateTime = modifiedDateTime;
    }
}
