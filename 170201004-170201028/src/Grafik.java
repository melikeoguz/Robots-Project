import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JPanel;

class Grafik extends JPanel {

    public Grafik() {

        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int i, n;

        //Aşağıdaki satirlarda ızgara oluşturuldu        
        g.setColor(Color.WHITE);
        g.drawRect(20, 20, 20, 20);

        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 20, 20, 20);
        }
        g.setColor(Color.CYAN);
        g.drawRect(20, 40, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 40, 20, 20);
        }
        g.setColor(Color.MAGENTA);
        g.drawRect(20, 60, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 60, 20, 20);
        }
        g.setColor(Color.PINK);
        g.drawRect(20, 80, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 80, 20, 20);
        }
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(20, 100, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 100, 20, 20);
        }
        g.setColor(Color.WHITE);
        g.drawRect(20, 120, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 120, 20, 20);
        }
        g.setColor(Color.CYAN);
        g.drawRect(20, 140, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 140, 20, 20);
        }
        g.setColor(Color.MAGENTA);
        g.drawRect(20, 160, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 160, 20, 20);
        }
        g.setColor(Color.PINK);
        g.drawRect(20, 180, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 180, 20, 20);
        }
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(20, 200, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 200, 20, 20);
        }
        g.setColor(Color.WHITE);
        g.drawRect(20, 220, 20, 20);

        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 220, 20, 20);
        }
        g.setColor(Color.CYAN);
        g.drawRect(20, 240, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 240, 20, 20);
        }
        g.setColor(Color.MAGENTA);
        g.drawRect(20, 260, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 260, 20, 20);
        }
        g.setColor(Color.PINK);
        g.drawRect(20, 280, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 280, 20, 20);
        }
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(20, 300, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 300, 20, 20);
        }
        g.setColor(Color.WHITE);
        g.drawRect(20, 320, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 320, 20, 20);
        }
        g.setColor(Color.CYAN);
        g.drawRect(20, 340, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 340, 20, 20);
        }
        g.setColor(Color.MAGENTA);
        g.drawRect(20, 360, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 360, 20, 20);
        }
        g.setColor(Color.PINK);
        g.drawRect(20, 380, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 380, 20, 20);
        }
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(20, 400, 20, 20);
        for (i = 0, n = 20; i < 19; i++, n = n + 20) {

            g.drawRect(20 + n, 400, 20, 20);
        }
        //Engeli temsil eden şekil kodlandı
        g.setColor(Color.WHITE);
        g.fillRect(505, 25, 20, 20);
        g.drawLine(530, 35, 570, 35);
        g.drawLine(570, 35, 555, 28);
        g.drawLine(570, 35, 555, 42);
        g.drawString("engel", 575, 37);

        //Robotlari temsil eden şekiller kodlandı
        g.setColor(Color.magenta);
        g.fillOval(505, 58, 20, 20);
        g.drawLine(530, 68, 570, 68);
        g.drawLine(570, 68, 555, 61);
        g.drawLine(570, 68, 555, 75);
        g.drawString("tekerlekli robot", 575, 70);

        g.setColor(Color.CYAN);
        g.fillOval(505, 91, 20, 20);
        g.drawLine(530, 101, 570, 101);
        g.drawLine(570, 101, 555, 94);
        g.drawLine(570, 101, 555, 108);
        g.drawString("paletli robot", 575, 103);

        g.setColor(Color.PINK);
        g.fillOval(505, 124, 20, 20);
        g.drawLine(530, 134, 570, 134);
        g.drawLine(570, 134, 555, 127);
        g.drawLine(570, 134, 555, 141);
        g.drawString("spider robot", 575, 136);

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(505, 157, 20, 20);
        g.drawLine(530, 167, 570, 167);
        g.drawLine(570, 167, 555, 160);
        g.drawLine(570, 167, 555, 174);
        g.drawString("seri robot", 575, 169);

        g.setColor(Color.ORANGE);
        g.fillOval(505, 190, 20, 20);
        g.drawLine(530, 200, 570, 200);
        g.drawLine(570, 200, 555, 193);
        g.drawLine(570, 200, 555, 207);
        g.drawString("paralel robot", 575, 202);

        g.setColor(Color.BLUE);
        g.fillOval(505, 223, 20, 20);
        g.drawLine(530, 233, 570, 233);
        g.drawLine(570, 233, 555, 226);
        g.drawLine(570, 233, 555, 240);
        g.drawString("hibrit robot", 575, 235);
        
        g.setColor(Color.RED);
        g.fillOval(505, 256, 20, 20);
        g.drawLine(530, 266, 570, 266);
        g.drawLine(570, 266, 555, 259);
        g.drawLine(570, 266, 555, 273);
        g.drawString("son konum", 575, 268);
        
        g.setColor(Color.GREEN);
        g.fillOval(505, 289, 20, 20);
        g.drawLine(530, 299, 570, 299);
        g.drawLine(570, 299, 555, 292);
        g.drawLine(570, 299, 555, 306);
        g.drawString("hibrit kolu", 575, 301);
        
        //Geri ok yonu kodlandi
        g.setColor(Color.WHITE);
        g.drawLine(460, 280, 460, 320);
        g.drawLine(460, 280, 454, 292);
        g.drawLine(460, 280, 466, 292);
        g.drawString("geri", 469, 280);

        //İleri ok yonu kodlandi   
        g.drawLine(460, 370, 460, 410);
        g.drawLine(460, 413, 454, 401);
        g.drawLine(460, 413, 466, 401);
        g.drawString("ileri", 470, 422);
        
        //Sag ok yonu kodlandi
         g.drawLine(260, 460, 310, 460);
         g.drawLine(259, 460, 268, 468);
         g.drawLine(259, 460, 268, 452);
         g.drawString("sol", 230, 465);
         
        //Sol ok yonu kodlandı
        g.drawLine(370, 460, 420, 460);
        g.drawLine(422, 460, 414, 468);
        g.drawLine(422, 460, 414, 452);
        g.drawString("sag", 430, 465);
        
        
        //Izgara etrafindaki sayilarin olusmasi icin yazildi
        Font font = new Font("Serif", Font.CENTER_BASELINE, 10);
        //Font class'i Kullabilmek için java.awt.Font import edildi
        g.setFont(font);
        //oluşturduğumuz font objesi

        int locationValues = 0;//matris'i koordinat sistemi gibi kullanacağımız için sayılandırma yaptık 
        String sLocationValues; //integer olan locationValues'u stringe çevirip bastırmak için
        for (i = 0; i < 401; i += 20) {
            sLocationValues = String.valueOf(locationValues); //int degeri ekrana basabilmek için stringe çevirdik
            g.drawString(sLocationValues, i + 15, 431); //y sabit x artarak ekrana basılıyor(matrisin x-ekseni)
            g.drawString(sLocationValues, 0, i + 20); //matrisin y-ekseni
            locationValues = locationValues + 10; //kutular 10mx10m lik old. icin her cizgi 10m aralıklı.0 10 20 diye basar
        }
    }
}

class engelYerlestir extends Grafik {

    int engelSayisi;
    int sayi = 1, boyut = 20, say = 0;
    int[] engelX;
    int[] engelY;
    
    public engelYerlestir() {
        setBackground(Color.BLACK);
    }

    @Override //JComponentten degil Grafikten override ediyor.
    
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
            
            while (say != engelSayisi) {
                g.setColor(Color.WHITE);
                g.fillRect((20 * engelX[sayi - 1]), (engelY[sayi - 1] * 20), 20, 20); //Izgarada bulunan karelerin uzunlukları 20px oldugu için x ve y degerlerini 20 ile carptık  
                say++;
                sayi++;

            }// .while say!=engelsayisi

    }// ./paint 

}  //engelYerlestir classinin sonu

class robotunIlkKonumu extends engelYerlestir {

    String yanit;
    String robotTipi;
    int robotYonX,robotYonY;
    
    public robotunIlkKonumu() {

        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
     /* Her robotu temsil eden farkli renkler oldugu icin kullanicinin izgaraya cikarmak 
        istedigi robotu bilmedigimiz icin bu problem else iflerle cozuldu */
                
        if("tekerlekli robot".equals(robotTipi))
        {
            g.setColor(Color.MAGENTA);
            g.fillOval((20*robotYonX),(20*robotYonY),20,20);
            
        }
        else if("paletli robot".equals(robotTipi))
        {
            g.setColor(Color.CYAN);
            g.fillOval((20*robotYonX),(20*robotYonY),20,20);
        }
         else if("spider robot".equals(robotTipi))
        {
            g.setColor(Color.PINK);
            g.fillOval((20*robotYonX),(20*robotYonY),20,20);
        }
        else if("seri robot".equals(robotTipi))
        {
            g.setColor(Color.LIGHT_GRAY);
            g.fillOval((20*robotYonX),(20*robotYonY),20,20);
        }
         else if("paralel robot".equals(robotTipi))
        {
            g.setColor(Color.ORANGE);
            g.fillOval((20*robotYonX),(20*robotYonY),20,20);
        }
        else
         {
            g.setColor(Color.BLUE);
            g.fillOval((20*robotYonX),(20*robotYonY),20,20);
         }
     
    }// ./paint 
          
}// ./robotunIlkKonumu

class robotIleri extends robotunIlkKonumu
{
   int hIleri;
    public robotIleri() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        if("tekerlekli robot".equals(robotTipi))
        {
            g.setColor(Color.MAGENTA);
            g.fillOval((20*robotYonX),(20*(robotYonY+hIleri)),20,20);
            
        }
        else if("paletli robot".equals(robotTipi))
        {
            g.setColor(Color.CYAN);
            g.fillOval((20*robotYonX),(20*(robotYonY+hIleri)),20,20);
        }
         else if("spider robot".equals(robotTipi))
        {
            g.setColor(Color.PINK);
            g.fillOval((20*robotYonX),(20*(robotYonY+hIleri)),20,20);
        }
        else if("seri robot".equals(robotTipi))
        {
            g.setColor(Color.LIGHT_GRAY);
            g.fillOval((20*robotYonX),(20*(robotYonY+hIleri)),20,20);
        }
         else if("paralel robot".equals(robotTipi))
        {
            g.setColor(Color.ORANGE);
            g.fillOval((20*robotYonX),(20*(robotYonY+hIleri)),20,20);
        }
        else
         {
            g.setColor(Color.BLUE);
            g.fillOval((20*robotYonX),(20*(robotYonY+hIleri)),20,20);
         }
        
        
    }// /.paint
    
}//./robotIleri

class robotGeri extends robotunIlkKonumu
{
    int hYson,hGeri;
    int sonYdegeri=hYson-hGeri;
    
    public robotGeri() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        if("tekerlekli robot".equals(robotTipi))
        {
            g.setColor(Color.MAGENTA);
            g.fillOval((20*robotYonX),(20*(hYson-hGeri)),20,20);
            
        }
        else if("paletli robot".equals(robotTipi))
        {
            g.setColor(Color.CYAN);
            g.fillOval((20*robotYonX),(20*(hYson-hGeri)),20,20);
        }
         else if("spider robot".equals(robotTipi))
        {
            g.setColor(Color.PINK);
            g.fillOval((20*robotYonX),(20*(hYson-hGeri)),20,20);
        }
        else if("seri robot".equals(robotTipi))
        {
            g.setColor(Color.LIGHT_GRAY);
            g.fillOval((20*robotYonX),(20*(hYson-hGeri)),20,20);
        }
         else if("paralel robot".equals(robotTipi))
        {
            g.setColor(Color.ORANGE);
            g.fillOval((20*robotYonX),(20*(hYson-hGeri)),20,20);
        }
        else
         {
            g.setColor(Color.BLUE);
            g.fillOval((20*robotYonX),(20*(hYson-hGeri)),20,20);
         }
        
    }// ./paint
    
    
}// ./robotGeri

class robotSaga extends robotunIlkKonumu
{
    int hSaga,sonY;

    public robotSaga() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        if("tekerlekli robot".equals(robotTipi))
        {
            g.setColor(Color.MAGENTA);
            g.fillOval((20*(robotYonX+hSaga)),(20*(sonY)),20,20);
            
        }
        else if("paletli robot".equals(robotTipi))
        {
            g.setColor(Color.CYAN);
            g.fillOval((20*(robotYonX+hSaga)),(20*(sonY)),20,20);
        }
         else if("spider robot".equals(robotTipi))
        {
            g.setColor(Color.PINK);
            g.fillOval((20*(robotYonX+hSaga)),(20*(sonY)),20,20);
        }
        else if("seri robot".equals(robotTipi))
        {
            g.setColor(Color.LIGHT_GRAY);
            g.fillOval((20*(robotYonX+hSaga)),(20*(sonY)),20,20);
        }
         else if("paralel robot".equals(robotTipi))
        {
            g.setColor(Color.ORANGE);
            g.fillOval((20*(robotYonX+hSaga)),(20*(sonY)),20,20);
        }
        else
         {
            g.setColor(Color.BLUE);
            g.fillOval((20*(robotYonX+hSaga)),(20*(sonY)),20,20);
         }
    }// /.paint
    
    
    
}// /.robotSaga

class robotunSonKonumu extends robotunIlkKonumu {

    int ileri,geri,saga,sola;
    
    public robotunSonKonumu() {

        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
     
          g.setColor(Color.RED); /* Robotun son konumu kirmizi renk ile gosterilir */
             //Son konumu bulmak icin bu kod yazildi
                    if (ileri > geri && saga > sola) 
                    {
                        g.fillOval((20 * (saga - sola + robotYonX)), ((ileri - geri + robotYonY) * 20), 20, 20); //Izgarada bulunan karelerin uzunlukları 20px oldugu için x ve y degerlerini 20 ile carptık  
                    } 
                    else if (ileri > geri&& saga < sola) 
                    {
                        g.fillOval((20 * (saga - sola + robotYonX)), ((robotYonY-(geri - ileri)) * 20), 20, 20);
                    } 
                    else if (ileri < geri && saga > sola) 
                    {
                        g.fillOval((20 * (robotYonX-(sola - saga))), ((ileri - geri + robotYonY) * 20), 20, 20);
                    } 
                    else if (ileri < geri && saga < sola) 
                    {
                        g.fillOval((20 * (robotYonX-(sola - saga))), ((robotYonY-(geri - ileri)) * 20), 20, 20);
                    }
         }// /.paint

    }// /.robotunSonKonumu

class hibritinHareketi extends robotunSonKonumu
{
    
    int sabitlenmeX,sabitlenmeY;
    int kIleri,kGeri,kSaga,kSola;

    public hibritinHareketi() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        g.setColor(Color.GREEN);
         if (kIleri > kGeri && kSaga > kSola) 
                    {
                        g.fillOval((20 * (kSaga - kSola + sabitlenmeX)), ((kIleri - kGeri + sabitlenmeY) * 20), 20, 20); //Izgarada bulunan karelerin uzunlukları 20px oldugu için x ve y degerlerini 20 ile carptık  
                    } 
                    else if (kIleri > kGeri&& kSaga < kSola) 
                    {
                        g.fillOval((20 * (kSaga - kSola + sabitlenmeX)), ((sabitlenmeY-(kGeri - kIleri)) * 20), 20, 20);
                    } 
                    else if (kIleri < kGeri && kSaga > kSola) 
                    {
                        g.fillOval((20 * (sabitlenmeX-(kSola - kSaga))), ((kIleri - kGeri + sabitlenmeY) * 20), 20, 20);
                    } 
                    else if (kIleri < kGeri && kSaga < kSola) 
                    {
                        g.fillOval((20 * (sabitlenmeX-(kSola - kSaga))), ((sabitlenmeY-(kGeri - kIleri)) * 20), 20, 20);
                    }
            }// /.paint
      }// /.hibritinHareketi classi