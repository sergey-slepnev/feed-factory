package ssp.micro.petfeed.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssp.micro.petfeed.service.FeedService;
import ssp.micro.petfeed.web.model.dto.FeedDto;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/feeds")
@RequiredArgsConstructor
public class FeedController {

    private final FeedService feedService;

    @GetMapping("/{feedId}")
    public ResponseEntity<FeedDto> getFeed(@PathVariable UUID feedId) {
        return new ResponseEntity<>(feedService.getById(feedId), HttpStatus.OK);
    }
}