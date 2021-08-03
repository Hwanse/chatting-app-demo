package me.hwanse.chatserver.chat.voice;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IceMessage {

    @NotNull
    @Min(1)
    private Long roomId;

    @NotEmpty
    private String fromId;

    @NotEmpty
    private String toId;

    private String type;

    private CandidateDto candidate;

}
