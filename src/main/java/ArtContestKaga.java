/*Author: Edward Mendoza
  Date created: January 12th, 2016
  Last modification: January 12th, 2016
  Art Contest Java File - This program was written to
  draw a picture of my favorite character from Kantai
  Collection, standard carrier Kaga.*/

//hair and eyes: WaifuMaker.setColor(new Color(48, 29, 24));
//hair 2: WaifuMaker.setColor(new Color(103, 63, 52));
//eyes 2: WaifuMaker.setColor(new Color(175, 111, 95));
//face: WaifuMaker.setColor(new Color(250, 234, 184));
//face 2: WaifuMaker.setColor(new Color(252, 173, 109));
//face 3: WaifuMaker.setColor(new Color(176, 107, 45));
//that one little square near the bottom: WaifuMaker.setColor(new Color(60, 53, 32));
//original image: http://www.pixiv.net/member_illust.php?mode=medium&illust_id=43179493

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class ArtContestKaga extends GraphicsProgram
{
    public void init()
    {
        setSize(400, 500); //increases graphics window height by 200px
    }

    public void run()
    {
        //creates and adds a GPen called "WaifuMaker" that will be visible and draw at a quick pace
        GPen WaifuMaker = new GPen();
        add(WaifuMaker);
        WaifuMaker.setSpeed(0.88);
        //WaifuMaker.showPen();

        //WaifuMaker is set to black for drawing the outline
        WaifuMaker.setColor(Color.BLACK);

        //WaifuMaker begins drawing the outline
        //WaifuMaker draws a rectangle starting at (13, 0) by drawing a 25px tall line 12 times
        WaifuMaker.setLocation(13, 0);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //WaifuMaker draws a rectangle at (0,25) by drawing a 13px tall line 13 times
        WaifuMaker.setLocation(0, 25);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //WaifuMaker draws a rectangle starting at (13, 0) by drawing a 13px tall line 13 times
        WaifuMaker.setLocation(325, 0);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (338, 13) is created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(338, 13);
        for(int i = 0; i < 12; i++) //mind the semicolons in the parentheses!
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (350, 25) is created with a 25px tall line drawn 12 times
        WaifuMaker.setLocation(350, 25);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (363, 50) is created with a 38px tall line drawn 12 times
        WaifuMaker.setLocation(363, 50);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (375, 88) is created with a 62px tall line drawn 13 times
        WaifuMaker.setLocation(375, 88);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 62);
            WaifuMaker.move(1, -62);
        }

        //rectangle at (363, 150) is created with a 25px tall line drawn 12 times
        WaifuMaker.setLocation(363, 150);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (338, 175) is created with a 13px tall line drawn 25 times
        WaifuMaker.setLocation(338, 175);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (338, 188) is created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(338, 188);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (338, 200) is created with a 13px tall line drawn 25 times
        WaifuMaker.setLocation(338, 200);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (338, 213) is created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(338, 213);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (363, 213) created with a 112px tall line drawn 12 times
        WaifuMaker.setLocation(363, 213);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 112);
            WaifuMaker.move(1, -112);
        }

        //rectangle at (338, 263) created with a 62px tall line drawn 12 times
        WaifuMaker.setLocation(338, 263);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 62);
            WaifuMaker.move(1, -62);
        }

        //rectangle at (375, 313) created with a 25px tall line drawn 13 times
        WaifuMaker.setLocation(375, 313);//13x25
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.drawLine(1, -25);
        }

        //rectangle at (388, 338) created with a 25px tall line drawn 12 times
        WaifuMaker.setLocation(388, 338);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (363, 350) created with a 25px long line drawn 14 times
        WaifuMaker.setLocation(363, 350);
        for(int i = 0; i < 14; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (350, 338) created with a 13px long line drawn 12 times
        WaifuMaker.setLocation(350, 338);//13x12
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (338, 363) created with a 37px tall line drawn 12 times
        WaifuMaker.setLocation(338, 363);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (325, 325) created with a 38px tall line drawn 13 times
        WaifuMaker.setLocation(325, 325);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (313, 350) created with a 25px tall line drawn 12 times
        WaifuMaker.setLocation(313, 350);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (300, 363) created with a 25px tall line drawn 13 times
        WaifuMaker.setLocation(300, 363);//13x25
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (288, 375) created with a 25px tall line drawn 12 times
        WaifuMaker.setLocation(288, 375);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (275, 388) created with a 25px tall line drawn 13 times
        WaifuMaker.setLocation(275, 388);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (263, 400) created with a 25px tall line drawn 12 times
        WaifuMaker.setLocation(263, 400);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (313, 388) created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(313, 388);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (313, 413) created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(313, 413);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (300, 400) created with a 13px tall line drawn 13 times
        WaifuMaker.setLocation(300, 400);//13x13
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (325, 400) created with a 13px tall line drawn 13 times
        WaifuMaker.setLocation(325, 400);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (288, 413) created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(288, 413);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (213, 413) created with a 62 px long line drawn 12 times
        WaifuMaker.setLocation(213, 413);//62x12
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(62, 0);
            WaifuMaker.move(-62, 1);
        }

        //rectangle at (225, 425) created with a 13px tall line drawn 13 times
        WaifuMaker.setLocation(225, 425);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (250, 425) created with a 13px tall line drawn 13 times
        WaifuMaker.setLocation(250, 425);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (275, 425) created with a 13px tall line drawn 13 times
        WaifuMaker.setLocation(275, 425);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (300, 425) created with a 13px tall line drawn 13 times
        WaifuMaker.setLocation(300, 425);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (225, 438) created with an 87px long line drawn 12 times
        WaifuMaker.setLocation(225, 438);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(87, 0);
            WaifuMaker.move(-87, 1);
        }

        //rectangle at (250, 450) created with a 38px tall line drawn 13 times
        WaifuMaker.setLocation(250, 450);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (238, 463) created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(238, 463);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (213, 475) created with a 25px long line drawn 13 times
        WaifuMaker.setLocation(213, 475);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (200, 488) created with a 13px long line drawn 12 times
        WaifuMaker.setLocation(200, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (238, 488) created with a 12px tall line drawn 12 times
        WaifuMaker.setLocation(238, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (288, 450) created with a 25px long line drawn 13 times
        WaifuMaker.setLocation(288, 450);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (300, 463) created with a 38px long line drawn 12 times
        WaifuMaker.setLocation(300, 463);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(38, 0);
            WaifuMaker.move(-38, 1);
        }

        //rectangle at (313, 475) created with a 25px tall line drawn 12 times
        WaifuMaker.setLocation(313, 475);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (338, 475) created with a 25px long line drawn 13 times
        WaifuMaker.setLocation(338, 475);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (363, 488) created with a 25px long line drawn 13 times
        WaifuMaker.setLocation(363, 488);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (188, 400) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(188, 400);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (13, 488) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(13, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (0, 463) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(0, 463);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (13, 450) created with 37px long line drawn 13 times
        WaifuMaker.setLocation(13, 450);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(37, 0);
            WaifuMaker.move(-37, 1);
        }

        //rectangle at (25, 463) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(25, 463);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (125, 488) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(125, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (75, 463) created with 37px tall line drawn 13 times
        WaifuMaker.setLocation(75, 463);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (113, 450) created with 38px tall line drawn 12 times
        WaifuMaker.setLocation(113, 450);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (50, 438) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(50, 438);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (63, 425) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(63, 425);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (88, 438) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(88, 438);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (100, 425) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(100, 425);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (50, 400) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(50, 400);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (88, 400) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(88, 400);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (113, 388) created with 50px tall line drawn 12 times
        WaifuMaker.setLocation(113, 388);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (63, 388) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(63, 388);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (163, 388) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(163, 388);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (75, 375) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(75, 375);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (100, 363) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(100, 363);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (138, 375) created with 25 long line drawn 13 times
        WaifuMaker.setLocation(138, 375);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (63, 363) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(63, 363);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (50, 350) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(50, 350);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (38, 338) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(38, 338);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (125, 363) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(125, 363);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        WaifuMaker.setLocation(138, 375);//25x13
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (113, 350) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(113, 350);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (63, 338) created with 50px long line drawn 12 times
        WaifuMaker.setLocation(63, 338);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(50, 0);
            WaifuMaker.move(-50, 1);
        }

        //rectangle at (88, 325) created with 38px tall line drawn 12 times
        WaifuMaker.setLocation(88, 325);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (25, 325) created with 38px long line drawn 13 times
        WaifuMaker.setLocation(25, 325);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(38, 0);
            WaifuMaker.move(-38, 1);
        }

        //rectangle at (13, 313) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(13, 313);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (0, 300) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(0, 300);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (0, 250) created with 50px tall line drawn 13 times
        WaifuMaker.setLocation(0, 250);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (13, 238) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(13, 238);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (75, 263) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(75, 263);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (63, 238) created with 25px tall line drawn 25 times
        WaifuMaker.setLocation(63, 238);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (25, 225) created with 38px long line drawn 13 times
        WaifuMaker.setLocation(25, 225);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(38, 0);
            WaifuMaker.move(-38, 1);
        }

        //rectangle at (50, 200) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(50, 200);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (38, 138) created with 62px tall line drawn 12 times
        WaifuMaker.setLocation(38, 138);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 62);
            WaifuMaker.move(1, -62);
        }

        //rectangle at (50, 113) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(50, 113);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (88, 213) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(88, 213);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (100, 200) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(100, 200);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (113, 188) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(113, 188);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (125, 175) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(125, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (113, 213) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(113, 213);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (125, 225) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(125, 225);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (138, 200) created with 50px long line drawn 25 times
        WaifuMaker.setLocation(138, 200);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(50, 0);
            WaifuMaker.move(-50, 1);
        }

        //rectangle at (188, 200) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(188, 200);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (163, 225) created with 25px tall line drawn 25 times
        WaifuMaker.setLocation(163, 225);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (288, 188) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(288, 188);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (300, 200) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(300, 200);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (300, 175) created with 25px tall line drawn 25 times
        WaifuMaker.setLocation(300, 175);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (238, 188) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(238, 188);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (225, 175) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(225, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (213, 163) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(213, 163);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (250, 163) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(250, 163);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (263, 150) created with 38px tall line drawn 12 times
        WaifuMaker.setLocation(263, 150);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (138, 150) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(138, 150);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (150, 125) created with 38px tall line drawn 13 times
        WaifuMaker.setLocation(150, 125);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (200, 138) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(200, 138);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (188, 100) created with 38px tall line drawn 12 times
        WaifuMaker.setLocation(188, 100);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (163, 100) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(163, 100);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (175, 88) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(175, 88);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (325, 163) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(325, 163);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (313, 138) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(313, 138);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (300, 113) created with 37px tall line drawn 13 times
        WaifuMaker.setLocation(300, 113);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (275, 113) created with 37px tall line drawn 13 times
        WaifuMaker.setLocation(275, 113);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (288, 75) created with 38px tall line drawn 12 times
        WaifuMaker.setLocation(288, 75);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }
        //outline is finished

        //WaifuMaker set to custom color to add the main color to hair and eyes
        WaifuMaker.setColor(new Color(48, 29, 24));

        //hair coloring begins here
        //rectangle at (25, 0) created with a very long line at 263px drawn 88 times
        WaifuMaker.setLocation(25, 0);
        for(int i = 0; i < 88; i++)
        {
            WaifuMaker.drawLine(263, 0);
            WaifuMaker.move(-263, 1);
        }

        //rectangle at (25, 88) created with a 50px tall line drawn 25 times
        WaifuMaker.setLocation(25, 88);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (0, 38) created with a very tall line at 212px drawn 13 times
        WaifuMaker.setLocation(0, 38);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 212);
            WaifuMaker.move(1, -212);
        }

        //rectangle at (13, 25) created with a very tall line at 213px drawn 12 times
        WaifuMaker.setLocation(13, 25);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 213);
            WaifuMaker.move(1, -213);
        }

        //rectangle at (25, 138) created with 87px tall line drawn 13 times
        WaifuMaker.setLocation(25, 138);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 87);
            WaifuMaker.move(1, -87);
        }

        //rectangle at (38, 200) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(38, 200);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (50, 88) created with a 125px long line drawn 12 times
        WaifuMaker.setLocation(50, 88);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(125, 0);
            WaifuMaker.move(-125, 1);
        }

        //rectangle at (50, 100) created with 75px long line drawn 13 times
        WaifuMaker.setLocation(50, 100);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(75, 0);
            WaifuMaker.move(-75, 1);
        }

        //rectangle at (138, 100) created with 25px tall line drawn 25 times
        WaifuMaker.setLocation(138, 100);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (63, 113) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(63, 113);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (88, 113) created with 37px long line drawn 12 times
        WaifuMaker.setLocation(88, 113);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(37, 0);
            WaifuMaker.move(-37, 1);
        }

        //rectangle at (88, 125) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(88, 125);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (113, 125) created with 37px long line drawn 25 times
        WaifuMaker.setLocation(113, 125);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(37, 0);
            WaifuMaker.move(-37, 1);
        }

        //rectangle at (113, 150) created with 25px tall line drawn 25 times
        WaifuMaker.setLocation(113, 150);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (113, 175) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(113, 175);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (50, 138) created with 63px long line drawn 62 times
        WaifuMaker.setLocation(50, 138);
        for(int i = 0; i < 62; i++)
        {
            WaifuMaker.drawLine(63, 0);
            WaifuMaker.move(-63, 1);
        }

        //rectangle at (63, 200) created with 37px long line drawn 13 times
        WaifuMaker.setLocation(63, 200);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(37, 0);
            WaifuMaker.move(-37, 1);
        }

        //rectangle at (63, 213) created with 25px tall line drawn 25 times
        WaifuMaker.setLocation(63, 213);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (188, 88) created with 100px long line drawn 12 times
        WaifuMaker.setLocation(188, 88);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(100, 0);
            WaifuMaker.move(-100, 1);
        }

        //rectangle at (200, 100) created with 88px long line drawn 13 times
        WaifuMaker.setLocation(200, 100);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(88, 0);
            WaifuMaker.move(-88, 1);
        }

        //rectangle at (200, 113) created with 75px long line drawn 25 times
        WaifuMaker.setLocation(200, 113);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(75, 0);
            WaifuMaker.move(-75, 1);
        }

        //rectangle at (213, 138) created with 62px long line drawn 12 times
        WaifuMaker.setLocation(213, 138);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(62, 0);
            WaifuMaker.move(-62, 1);
        }

        //rectangle at (213, 150) created with 50px long line drawn 13 times
        WaifuMaker.setLocation(213, 150);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(50, 0);
            WaifuMaker.move(-50, 1);
        }

        //rectangle at (225, 163) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(225, 163);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (288, 0) created with 75px tall line drawn 37 times
        WaifuMaker.setLocation(288, 0);
        for(int i = 0; i < 37; i++)
        {
            WaifuMaker.drawLine(0, 75);
            WaifuMaker.move(1, -75);
        }

        //rectangle at (325, 13) created with 150px tall line drawn 13 times
        WaifuMaker.setLocation(325, 13);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 150);
            WaifuMaker.move(1, -150);
        }

        //rectangle at (338, 25) created with 150px tall line drawn 12 times
        WaifuMaker.setLocation(338, 25);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 150);
            WaifuMaker.move(1, -150);
        }

        //rectangle at (350, 50) created with 125px tall line drawn 13 times
        WaifuMaker.setLocation(350, 50);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 125);
            WaifuMaker.move(1, -125);
        }

        //rectangle at (363, 88) created with 62px tall line drawn 12 times
        WaifuMaker.setLocation(363, 88);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 62);
            WaifuMaker.move(1, -62);
        }

        //rectangle at (300, 75) created with 38px tall line drawn 13 times
        WaifuMaker.setLocation(300, 75);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (313, 75) created with 63px tall line drawn 12 times
        WaifuMaker.setLocation(313, 75);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 63);
            WaifuMaker.move(1, -63);
        }

        //rectangle at (50, 338) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(50, 338);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (63, 350) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(63, 350);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (75, 363) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(75, 363);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (88, 375) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(88, 375);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (100, 388) created with 37px tall line drawn 13 times
        WaifuMaker.setLocation(100, 388);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (238, 425) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(238, 425);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (263, 425) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(263, 425);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (288, 425) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(288, 425);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (275, 413) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(275, 413);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (300, 413) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(300, 413);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (288, 400) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(288, 400);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (313, 400) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(313, 400);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (300, 388) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(300, 388);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (313, 375) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(313, 375);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (325, 363) created with 37px tall line drawn 13 times
        WaifuMaker.setLocation(325, 363);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (350, 213) created with 125px tall line drawn 13 times
        WaifuMaker.setLocation(350, 213);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 125);
            WaifuMaker.move(1, -125);
        }

        //rectangle at (338, 325) created with 38px tall line drawn 12 times
        WaifuMaker.setLocation(338, 325);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (363, 325) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(363, 325);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (363, 338) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(363, 338);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (338, 225) created with 38px tall line drawn 12 times
        WaifuMaker.setLocation(338, 225);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }
        //hair coloring paused

        //eye coloring started
        //rectangle at (150, 250) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(150, 250);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (288, 225) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(288, 225);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (150, 225) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(150, 225);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (288, 200) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(288, 200);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }
        //eye coloring paused

        //WaifuMaker set to custom color to add more color to hair
        WaifuMaker.setColor(new Color(103, 63, 52));

        //rectangle at (75, 113) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(75, 113);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (100, 125) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(100, 125);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (125, 100) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(125, 100);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }
        //hair coloring ends

        //WaifuMaker set to custom color to add more color to eyes
        WaifuMaker.setColor(new Color(175, 111, 95));

        //rectangle created at (150, 238) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(150, 238);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle created at (288, 213) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(288, 213);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }
        //eye color finished

        //WaifuMaker set to custom color to color most of the face
        WaifuMaker.setColor(new Color(250, 234, 184));

        //rectangle at (188, 138) created with 37px tall line drawn 12 times
        WaifuMaker.setLocation(188, 138);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (175, 163) created with 38px long line drawn 12 times
        WaifuMaker.setLocation(175, 163);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(38, 0);
            WaifuMaker.move(-38, 1);
        }

        //rectangle at (163, 175) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(163, 175);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (200, 175) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(200, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (150, 188) created with 88px long line drawn 12 times
        WaifuMaker.setLocation(150, 188);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(88, 0);
            WaifuMaker.move(-88, 1);
        }

        //rectangle at (250, 175) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(250, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (263, 188) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(263, 188);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (275, 175) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(275, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle (275, 163) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(275, 163);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (200, 200) created with 88px long line drawn 50 times
        WaifuMaker.setLocation(200, 200);
        for(int i = 0; i < 50; i++)
        {
            WaifuMaker.drawLine(88, 0);
            WaifuMaker.move(-88, 1);
        }

        //rectangle at (125, 200) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(125, 200);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (325, 213) created with 87px tall line drawn 13 times
        WaifuMaker.setLocation(325, 213);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 87);
            WaifuMaker.move(1, -87);
        }

        //rectangle at (313, 225) created with 113px tall line drawn 12 times
        WaifuMaker.setLocation(313, 225);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 113);
            WaifuMaker.move(1, -113);
        }

        //rectangle at (288, 238) created with 50px tall line drawn 25 times
        WaifuMaker.setLocation(288, 238);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (300, 288) created with 75px tall line drawn 13 times
        WaifuMaker.setLocation(300, 288);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 75);
            WaifuMaker.move(1, -75);
        }

        //rectangle at (288, 300) created with 75px tall line drawn 12 times
        WaifuMaker.setLocation(288, 300);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 75);
            WaifuMaker.move(1, -75);
        }

        //rectangle at (213, 250) created with 100px tall line drawn 75 times
        WaifuMaker.setLocation(213, 250);
        for(int i = 0; i < 75; i++)
        {
            WaifuMaker.drawLine(0, 100);
            WaifuMaker.move(1, -100);
        }

        //rectangle at (275, 350) created with 38px tall line drawn 13 times
        WaifuMaker.setLocation(275, 350);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangl at (263, 350) created with 50px tall line drawn 12 times
        WaifuMaker.setLocation(263, 350);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (238, 363) created with 50px tall line drawn 25 times
        WaifuMaker.setLocation(238, 363);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (225, 375) created with 38px tall line drawn 13 times
        WaifuMaker.setLocation(225, 375);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (213, 350) created with 63px tall line drawn 12 times
        WaifuMaker.setLocation(213, 350);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 63);
            WaifuMaker.move(1, -63);
        }

        //rectangle at (225, 350) created with 13px long line drawn 13 times
        WaifuMaker.setLocation(225, 350);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (200, 263) created with 137px tall line drawn 13 times
        WaifuMaker.setLocation(200, 263);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 137);
            WaifuMaker.move(1, -137);
        }

        //rectangle at (188, 225) created with 163px tall line drawn 12 times
        WaifuMaker.setLocation(188, 225);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 163);
            WaifuMaker.move(1, -163);
        }

        //rectangle at (175, 250) created with 138px tall line drawn 13 times
        WaifuMaker.setLocation(175, 250);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 138);
            WaifuMaker.move(1, -138);
        }

        WaifuMaker.setLocation(163, 263);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 125);
            WaifuMaker.move(1, -125);
        }

        //rectangle at (150, 263) created with 112px tall line drawn 13 times
        WaifuMaker.setLocation(150, 263);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 112);
            WaifuMaker.move(1, -112);
        }

        //rectangle at (138, 263) created with 100px tall line drawn 12 times
        WaifuMaker.setLocation(138, 263);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 100);
            WaifuMaker.move(1, -100);
        }

        //rectangle at (125, 250) created with 100px tall line drawn 13 times
        WaifuMaker.setLocation(125, 250);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 100);
            WaifuMaker.move(1, -100);
        }

        //rectangle at (113, 225) created with 125px tall line drawn 12 times
        WaifuMaker.setLocation(113, 225);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 125);
            WaifuMaker.move(1, -125);
        }

        //rectangle at (100, 238) created with 87px tall line drawn 13 times
        WaifuMaker.setLocation(100, 238);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 87);
            WaifuMaker.move(1, -87);
        }

        //rectangle at (88, 250) created with 75px tall line drawn 12 times
        WaifuMaker.setLocation(88, 250);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 75);
            WaifuMaker.move(1, -75);
        }

        //rectangle at (75, 275) created with 63px tall line drawn 13 times
        WaifuMaker.setLocation(75, 275);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 63);
            WaifuMaker.move(1, -63);
        }

        //rectangle at (63, 263) created with 63px tall line drawn 12 times
        WaifuMaker.setLocation(63, 263);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (25, 238) created with 38px long line drawn 12 times
        WaifuMaker.setLocation(25, 238);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(38, 0);
            WaifuMaker.move(-38, 1);
        }

        //rectangle at (50, 250) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(50, 250);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (25, 250) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(25, 250);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (13, 263) created with 37px tall line drawn 12 times
        WaifuMaker.setLocation(13, 263);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (25, 288) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(25, 288);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (38, 300) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(38, 300);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (50, 313) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(50, 313);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (63, 325) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(63, 325);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (125, 450) created with 50px long line drawn 38 times
        WaifuMaker.setLocation(125, 450);
        for(int i = 0; i < 38; i++)
        {
            WaifuMaker.drawLine(50, 0);
            WaifuMaker.move(-50, 1);
        }

        //rectangle at (175, 463) created with 25px long line drawn 14 times
        WaifuMaker.setLocation(175, 463);
        for(int i = 0; i < 14; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (189, 475) created with 24px long line drawn 13 times
        WaifuMaker.setLocation(189, 475);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(24, 0);
            WaifuMaker.move(-24, 1);
        }

        //rectangle at (138, 488) created with 62px long line drawn 12 times
        WaifuMaker.setLocation(138, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(62, 0);
            WaifuMaker.move(-62, 1);
        }

        //rectangle at (113, 438) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(113, 438);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (125, 413) created with 37px tall line drawn 14 times
        WaifuMaker.setLocation(125, 413);
        for(int i = 0; i < 14; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (139, 425) created with 25px tall line drawn 11 times
        WaifuMaker.setLocation(139, 425);
        for(int i = 0; i < 11; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //WaifuMaker set to custom color to add a second color to face
        WaifuMaker.setColor(new Color(252, 173, 109));

        //rectangle at (175, 100) created with 50px tall line drawn 13 times
        WaifuMaker.setLocation(175, 100);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (163, 125) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(163, 125);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (150, 163) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(150, 163);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (138, 175) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(138, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (125, 188) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(125, 188);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (175, 175) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(175, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (288, 113) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(288, 113);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (288, 150) created with 25px tall line drawn 25 times
        WaifuMaker.setLocation(288, 150);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (313, 163) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(313, 163);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (325, 175) created with 38px tall line drawn 13 times
        WaifuMaker.setLocation(325, 175);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (113, 200) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(113, 200);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (100, 213) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(100, 213);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (88, 238) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(88, 238);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (38, 250) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(38, 250);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (25, 263) created with 38px long line drawn 25 times
        WaifuMaker.setLocation(25, 263);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(38, 0);
            WaifuMaker.move(-38, 1);
        }

        //rectangle at (38, 288) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(38, 288);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (50, 300) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(50, 300);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (325, 300) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(325, 300);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (313, 338) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(313, 338);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (238, 350) created with 13px tall line drawn 12 times
        WaifuMaker.setLocation(238, 350);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (100, 325) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(100, 325);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (125, 350) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(125, 350);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (138, 363) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(138, 363);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (188, 388) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(188, 388);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (100, 350) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(100, 350);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (113, 363) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(113, 363);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (125, 375) created with 38px tall  line drawn 13 times
        WaifuMaker.setLocation(125, 375);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 38);
            WaifuMaker.move(1, -38);
        }

        //rectangle at (138, 388) created with 37px tall line drawn 25 times
        WaifuMaker.setLocation(138, 388);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (149, 400) created with 50px tall line drawn 39 times
        WaifuMaker.setLocation(149, 400);
        for(int i = 0; i < 39; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (175, 413) created with 50px tall line drawn 38 times
        WaifuMaker.setLocation(175, 413);
        for(int i = 0; i < 38; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (188, 425) created with 50px tall line drawn 37 times
        WaifuMaker.setLocation(188, 425);
        for(int i = 0; i < 37; i++)
        {
            WaifuMaker.drawLine(0, 50);
            WaifuMaker.move(1, -50);
        }

        //rectangle at (225, 450) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(225, 450);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (225, 463) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(225, 463);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //WaifuMaker set to last custom color for face
        WaifuMaker.setColor(new Color(176, 107, 45));

        //rectangle at (163, 150) created with 25px long line drawn 13 times
        WaifuMaker.setLocation(163, 150);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (275, 150) created with 13px long line drawn 13 times
        WaifuMaker.setLocation(275, 150);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (288, 138) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(288, 138);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (225, 363) created with 13px long line drawn 12 times
        WaifuMaker.setLocation(225, 363);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(13, 0);
            WaifuMaker.move(-13, 1);
        }

        //rectangle at (250, 350) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(250, 350);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (288, 288) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(288, 288);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }
        //end face coloring

        //WaifuMaker set to a shade of blue for tasuki and undershirt
        WaifuMaker.setColor(new Color(68, 95, 166));

        //rectangle at (0, 475) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(0, 475);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (13, 463) created with 25px tall line drawn 12 times
        WaifuMaker.setLocation(13, 463);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (88, 463) created with 37px tall line drawn 25 times
        WaifuMaker.setLocation(88, 463);
        for(int i = 0; i < 25; i++)
        {
            WaifuMaker.drawLine(0, 37);
            WaifuMaker.move(1, -37);
        }

        //rectangle at (100, 450) created with 13px tall line drawn 13 times
        WaifuMaker.setLocation(100, 450);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }

        //rectangle at (113, 488) created with 12px tall line drawn 12 times
        WaifuMaker.setLocation(113, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 12);
            WaifuMaker.move(1, -12);
        }

        //rectangle at (213, 488) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(213, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }

        //rectangle at (325, 475) created with 25px tall line drawn 13 times
        WaifuMaker.setLocation(325, 475);
        for(int i = 0; i < 13; i++)
        {
            WaifuMaker.drawLine(0, 25);
            WaifuMaker.move(1, -25);
        }

        //rectangle at (338, 488) created with 25px long line drawn 12 times
        WaifuMaker.setLocation(338, 488);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(25, 0);
            WaifuMaker.move(-25, 1);
        }
        //end coloring tasuki and undershirt

        //WaifuMaker set to final color; the custom color for the square near the bottom
        WaifuMaker.setColor(new Color(60, 53, 32));

        WaifuMaker.setLocation(238, 475);
        for(int i = 0; i < 12; i++)
        {
            WaifuMaker.drawLine(0, 13);
            WaifuMaker.move(1, -13);
        }
        //end program
    }
}