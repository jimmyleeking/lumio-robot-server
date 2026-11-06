package xiaozhi.modules.security.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "谷歌登录表单")
public class GoogleLoginDTO {
    @Schema(description = "谷歌Id")
    private String googleId;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "Token签名，用于服务端验证身份有效性")
    private String tokenSignature;
}
