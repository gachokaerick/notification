package com.gachokaerick.eshop.notification.service.dto;

import com.gachokaerick.eshop.notification.domain.enumeration.NotificationType;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.gachokaerick.eshop.notification.domain.Notification} entity.
 */
@ApiModel(description = "@author Erick Gachoka")
public class NotificationDTO implements Serializable {

    private Long id;

    @NotNull
    private Instant date;

    @NotNull
    private String details;

    private Instant sentDate;

    @NotNull
    private NotificationType format;

    private UserDTO user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Instant getSentDate() {
        return sentDate;
    }

    public void setSentDate(Instant sentDate) {
        this.sentDate = sentDate;
    }

    public NotificationType getFormat() {
        return format;
    }

    public void setFormat(NotificationType format) {
        this.format = format;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationDTO)) {
            return false;
        }

        NotificationDTO notificationDTO = (NotificationDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, notificationDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "NotificationDTO{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", details='" + getDetails() + "'" +
            ", sentDate='" + getSentDate() + "'" +
            ", format='" + getFormat() + "'" +
            ", user=" + getUser() +
            "}";
    }
}
