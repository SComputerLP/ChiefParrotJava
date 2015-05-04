package chiefparrot.data;

/**
 * ChiefParrotJava
 *
 * @author Julian Maierl
 * @version 1.0.0
 */
public class Message
{

  private int id;
  private String info;
  /**
   * 
   * @param id id of the Message
   * @param info info of the Message
   */
  public Message(int id, String info)
  {
    this.id = id;
    this.info = info;
  }

  /**
   * Get id
   *
   * @return id of the Message
   */
  public int getId()
  {
    return id;
  }

  /**
   * Get info
   *
   * @return info of the Message
   */
  public String getInfo()
  {
    return info;
  }
}
