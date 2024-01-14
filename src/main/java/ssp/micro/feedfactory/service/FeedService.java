package ssp.micro.feedfactory.service;

import ssp.micro.feedfactory.web.model.dto.FeedDto;

import java.util.UUID;

public interface FeedService {

    FeedDto getById(UUID feedId);
}