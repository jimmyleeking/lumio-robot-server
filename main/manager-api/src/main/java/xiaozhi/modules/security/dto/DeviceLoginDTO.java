package xiaozhi.modules.security.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "设备登录表单")
public class DeviceLoginDTO {
    @Schema(description = "设备MAC地址")
    private String macAddress;
}
