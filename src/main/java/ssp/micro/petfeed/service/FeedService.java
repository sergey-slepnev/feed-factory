package ssp.micro.petfeed.service;

import ssp.micro.petfeed.web.model.dto.FeedDto;

import java.util.UUID;

public interface FeedService {

    FeedDto getById(UUID feedId);
}