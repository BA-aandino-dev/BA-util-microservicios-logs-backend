package hn.bancatlan.microservicioLogs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoTodoDto {
	private Long userId;
	private Long id;
	private String title;
	private Boolean completed;
}
