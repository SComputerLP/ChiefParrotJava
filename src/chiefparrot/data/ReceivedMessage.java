package chiefparrot.data;

/**
 * ChiefParrotJava
 *
 * @author Julian Maierl
 * @version 1.0.0
 */
public class ReceivedMessage extends Message
{

  private int x, y, speedInPercent, directionInDegrees;
  private String status;

  /**
   *
   * @param id id of the Message
   * @param info info of the Message
   * @param x x value of the Message
   * @param y y value of the Message
   * @param speedInPercent speed in percent
   * @param directionInDegrees direction in degrees
   * @param status status of the Message
   */
  public ReceivedMessage(int id, String info, int x, int y, int speedInPercent, int directionInDegrees, String status)
  {
    super(id, info);
    this.x = x;
    this.y = y;
    this.speedInPercent = speedInPercent;
    this.directionInDegrees = directionInDegrees;
    this.status = status;
  }

  /**
   *
   * @return x value
   */
  public int getX()
  {
    return x;
  }

  /**
   *
   * @return y value
   */
  public int getY()
  {
    return y;
  }

  /**
   *
   * @return speed in percent
   */
  public int getSpeedInPercent()
  {
    return speedInPercent;
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
   * @return message status
   */
  public String getStatus()
  {
    return status;
  }

}
