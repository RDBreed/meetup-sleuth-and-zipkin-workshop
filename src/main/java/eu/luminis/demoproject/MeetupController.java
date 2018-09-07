package eu.luminis.demoproject;

import eu.luminis.meetupclient.ServiceClient;
import eu.luminis.meetupclient.ServiceClient.CallAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("meetup")
public class MeetupController {

  private final ServiceClient serviceClient;

  @Autowired
  public MeetupController(ServiceClient serviceClient) {
    this.serviceClient = serviceClient;
  }

  @GetMapping("hello")
  public String hello() {
    return serviceClient.startCall(CallAction.HELLO, null);
  }
}
