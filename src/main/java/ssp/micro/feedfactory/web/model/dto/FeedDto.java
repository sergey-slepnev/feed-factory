package ssp.micro.feedfactory.web.model.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record FeedDto(UUID id,
                      String feedName,
                      String feedType,
                      Long barCode) {
}