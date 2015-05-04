package chiefparrot.data;

/**
 * ChiefParrotJava
 *
 * @author Julian Maierl
 * @version 1.0.0
 */
public class SentCommand extends Message
{

  private String cmd;
  private int directionInDegrees;
  private int speedInPercent;
  private final String FILE_TOKEN_DELIMITER = "$";

  /**
   *
   * @param id id of the Message
   * @param info info of the Message
   * @param cmd command
   * @param directionInDegrees direction in degrees
   * @param speedInPercent speed in percent
   */
  public SentCommand(int id, String info, String cmd, int directionInDegrees, int speedInPercent)
  {
    super(id, info);
    this.cmd = cmd;
    this.directionInDegrees = directionInDegrees;
    this.speedInPercent = speedInPercent;
  }

  /**
   *
   * @return command
   */
  public String getCmd()
  {
    return cmd;
  }

  /**
   *
   * @return direction in degrees
   */
  public int getDirectionInDegrees()
  {
    return directionInDegrees;
  }

  /**
   *
   * @return speed in percent
   */
  public int getSpeedInPercent()
  {
    return speedInPercent;
  }

}
