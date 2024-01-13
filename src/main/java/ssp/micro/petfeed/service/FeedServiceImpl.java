package ssp.micro.petfeed.service;

import org.springframework.stereotype.Service;
import ssp.micro.petfeed.web.model.dto.FeedDto;

import java.util.UUID;

@Service
public class FeedServiceImpl implements FeedService {

    @Override
    public FeedDto getById(UUID feedId) {
        return FeedDto.builder()
                .id(UUID.randomUUID())
                .feedName("Whiskas")
                .feedType("Dry")
                .build();
    }
}
