import java.util.*;
interface LightBehavior{void activate();}
public class SmartHomeLighting{
 public static void main(String[] args){
  LightBehavior motion = () -> System.out.println("Motion detected: lights ON at full brightness");
  LightBehavior night = () -> System.out.println("Time-based: dim lights for night mode");
  LightBehavior voice = () -> System.out.println("Voice command received: set scene to Relax");
  List<LightBehavior> behaviors = Arrays.asList(motion, night, voice);
  behaviors.forEach(LightBehavior::activate);
 }
}
