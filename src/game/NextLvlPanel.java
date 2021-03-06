package game;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Created by um on 25/04/17.
 */

/**
 * NextLvlPanel.
 * Menangani panel "Next Level"
 */
public class NextLvlPanel extends JPanel {
  private Image background;

  /**
   * Konstruktor.
   */
  public NextLvlPanel() {
    background = new ImageIcon("./images/Levelup.jpg").getImage();
  }

  /**
   * Menangani tampilan visual panel.
   * @param graphics Kelas Graphics yang dipakai
   */
  @Override
  public void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    graphics.drawImage(background, 0, 0, null);
  }
}
