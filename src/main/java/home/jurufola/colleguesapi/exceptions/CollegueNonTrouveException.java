package home.jurufola.colleguesapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Collègue non trouvé")
public class CollegueNonTrouveException extends RuntimeException {
}
