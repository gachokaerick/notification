package com.gachokaerick.eshop.notification.service.mapper;

import com.gachokaerick.eshop.notification.domain.Notification;
import com.gachokaerick.eshop.notification.service.dto.NotificationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Notification} and its DTO {@link NotificationDTO}.
 */
@Mapper(componentModel = "spring", uses = { UserMapper.class })
public interface NotificationMapper extends EntityMapper<NotificationDTO, Notification> {
    @Mapping(target = "user", source = "user", qualifiedByName = "login")
    NotificationDTO toDto(Notification s);
}
