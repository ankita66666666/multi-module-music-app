//package com.stackroute.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.stackroute.domain.Track;
//import com.stackroute.exceptions.GlobalExceptions;
//import com.stackroute.exceptions.TrackAlreadyExistExceptions;
//import com.stackroute.service.TrackService;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest
//public class TrackControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//    private Track track;
//    @MockBean
//    private TrackService trackService;
//    @InjectMocks
//    private TrackController trackController;
//    private List<Track> list = null;
//
//
//
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(trackController).setControllerAdvice(new GlobalExceptions()).build();
//        track = new Track();
//        track.setId(201);
//        track.setTrackName("Ek tha tiger");
//        track.setComments("Ek tha tiger ");
//        list = new ArrayList<Track>();
//        list.add(track);
//    }
//
//    @After
//    public void tearDown() {
//        track = null;
//    }
//
//    @Test
//    public void saveTrack() throws TrackAlreadyExistExceptions, Exception {
//        when(trackService.saveTrack(any())).thenReturn(track);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    @Test
//    public void saveTrackFailure() throws Exception {
//        when(trackService.saveTrack(any())).thenThrow(TrackAlreadyExistExceptions.class);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isConflict())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    @Test
//    public void getAllTrack() throws Exception {
//        when(trackService.getAllTrack()).thenReturn(list);
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/track")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isFound())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//
//
//
////    @Test
////    public void getAllTracksFailure() throws Exception {
////        when(trackService.getAllTracks()).thenThrow(Exception.class);
////        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/track")
////                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
////                .andExpect(MockMvcResultMatchers.status().isConflict())
////                .andDo(MockMvcResultHandlers.print());
////    }
//
//    /*@Test
//    public void getAllTrackFailure() throws Exception {
//        when(trackService.getAllTracks()).thenThrow(TrackAlreadyExistExceptions.class);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isConflict())
//                .andDo(MockMvcResultHandlers.print());
//    }*/
//
//    private static String asJsonString(final Object obj) {
//        try {
//            return new ObjectMapper().writeValueAsString(obj);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//}