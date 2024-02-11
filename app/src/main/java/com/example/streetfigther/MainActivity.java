package com.example.streetfigther;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.content.pm.ActivityInfo;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MediaPlayer media;
    static ArrayList<Peleador> peleador1 = new ArrayList();
    static ArrayList<Peleador>peleador2 = new ArrayList();
    static Peleador luchador1 = new Peleador();
    static Peleador luchador2 = new Peleador();
    ImageView ryu= findViewById(R.id.ryu);
    ImageView ken= findViewById(R.id.ken);
    ImageView chunli= findViewById(R.id.chunli);
    ImageView guile= findViewById(R.id.guile);
    ImageView honda= findViewById(R.id.honda);
    ImageView dhalsim= findViewById(R.id.dhalsim);
    ImageView blanka= findViewById(R.id.blanka);
    ImageView zangief= findViewById(R.id.zangief);
    ImageView deejay= findViewById(R.id.deejay);
    ImageView thawk= findViewById(R.id.thawk);
    ImageView cammy= findViewById(R.id.cammy);
    ImageView vega = findViewById(R.id.vega);
    ImageView balrog = findViewById(R.id.balrog);
    ImageView sagat = findViewById(R.id.sagat);
    ImageView bison = findViewById(R.id.bison);
    ImageView ryu_2= findViewById(R.id.ryu_2);
    ImageView ken_2= findViewById(R.id.ken_2);
    ImageView chunli_2= findViewById(R.id.chunli_2);
    ImageView guile_2= findViewById(R.id.guile_2);
    ImageView honda_2= findViewById(R.id.honda_2);
    ImageView dhalsim_2= findViewById(R.id.dhalsim_2);
    ImageView blanka_2= findViewById(R.id.blanka_2);
    ImageView zangief_2= findViewById(R.id.zangief_2);
    ImageView deejay_2= findViewById(R.id.deejay_2);
    ImageView thawk_2= findViewById(R.id.thawk_2);
    ImageView cammy_2= findViewById(R.id.cammy_2);
    ImageView vega_2= findViewById(R.id.vega_2);
    ImageView balrog_2 = findViewById(R.id.balrog_2);
    ImageView sagat_2 = findViewById(R.id.sagat_2);
    ImageView bison_2 = findViewById(R.id.bison_2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        Peleador ryu1 = new Peleador("Ryu", "src/img/paises/japon.png", 26, 1.75, 85, 27, 32, 31, "Luchador entrenado por Gouken famoso por su potente Hadoken, golpe ganador con el que \r\n"
                + "derrotó a Sagat en el primer torneo y lo hirió gravemente.", "src/img/ryu/ryuAtaque1.gif", 151, 362, 328, 398, "src/img/ryu/ryuDefensa1.gif", 151, 362, 328, 398, "src/img/ryu/ryuDescanso1.gif", 151, 362, 328, 398, "src/img/ryu/RyuDerrota1.gif", 0, 362, 479, 398, "src/img/ryu/ryuPose1.gif", 151, 362, 328, 398,"src/img/pantallas/ryuMap.gif","src/sound/ryuTheme.aiff",ryu);

        Peleador ken1 = new Peleador("Ken", "src/img/paises/ee_uu.png", 25, 1.75, 86, 28, 30, 32, "Descendiente de una rica familia estadounidense, su padre pagó para formarle en kárate. \r\n"
                + "Discípulo de Gouken igual que Ryu pretende ser el mejor luchador del mundo, por encima de Ryu.", "src/img/ken/kenAtaque1.gif", 66, 350, 457, 410, "src/img/ken/kenDefensa1.gif", 20, 172, 548, 588, "src/img/ken/kenDescanso1.gif", 97, 385, 426, 375, "src/img/ken/kenDerrota1.gif", 0, 362, 479, 398, "src/img/ken/kenPose1.gif", 151, 362, 328, 398,"src/img/pantallas/kenMap.gif","src/sound/kenTheme.aiff",ken);

        Peleador chunli1 = new Peleador("Chun-Li", "src/img/paises/china.png", 19, 1.65, 58, 18, 21, 51, "Artista marcial experta y oficial de la Interpol. Sin descanso, ella busca venganza por la muerte de \r\n"
                + "su padre a manos del líder de la organización criminal Shadaloo, M.Bison.", "src/img/chun-li/chunliAtaque1.gif", 54, 328, 408, 390, "src/img/chun-li/chunliDefensa1.gif", 151, 362, 328, 398, "src/img/chun-li/chunliDescanso1.gif", 151, 362, 328, 398, "src/img/chun-li/chunliDerrota1.gif", 1, 1, 1, 1, "src/img/chun-li/chunliPose1.gif", 151, 362, 328, 398,"src/img/pantallas/chunliMap.gif","src/sound/chunliTheme.aiff",chunli);

        Peleador guile1 = new Peleador("Guile", "src/img/paises/ee_uu.png", 42, 1.85, 100, 34, 23, 33, "Ingresa al torneo para poner a M.Bison bajo custodia por ser el asesino de su mejor amigo Charlie, \r\n"
                + "solo la victoria sobre el mismo le hará enfrentarse a él y poder derrotarlo.", "src/img/guile/guileAtaque1.gif", 79, 362, 444, 398, "src/img/guile/guileDefensa1.gif", 140, 362, 339, 398, "src/img/guile/guileDescanso1.gif", 151, 362, 328, 398, "src/img/guile/guileDerrota1.gif", 1, 1, 1, 1, "src/img/guile/guilePose1.gif", 151, 362, 328, 398,"src/img/pantallas/guileMap.gif","src/sound/guileTheme.aiff",guile);

        Peleador honda1 = new Peleador("Honda", "src/img/paises/japon.png", 40, 1.89, 170, 46, 26, 18, "Luchador de sumo profesional de Japón que entra al torneo para demostrar que el sumo es el \r\n"
                + "mejor estilo de lucha del mundo por lo que retará a todo el que pretenda enfrentarse a él.", "src/img/honda/hondaAtaque1.gif", 54, 382, 519, 392, "src/img/honda/hondaDefensa1.gif", 58, 354, 465, 420, "src/img/honda/hondaDescanso1.gif", 67, 322, 492, 422, "src/img/honda/hondaDerrota1.gif", 1, 1, 1, 1, "src/img/honda/hondaPose1.gif", 151, 382, 328, 392,"src/img/pantallas/hondaMap.gif","src/sound/hondaTheme.aiff",honda);

        Peleador dhalsim1 = new Peleador("Dhalsim", "src/img/paises/india.png", 58, 1.76, 65, 24, 32, 34, "Pacifista pero entró a un torneo de lucha para recaudar dinero para su aldea empobrecida. Ha \r\n"
                + "dedicado su vida a la meditación lo que le permite expulsar fuego por la boca y estirar su cuerpo.", "src/img/dhalsim/dhalsimAtaque1.gif", 20, 312, 554, 423, "src/img/dhalsim/dhalsimDefensa1.gif", 53, 362, 426, 398, "src/img/dhalsim/dhalsimDescanso1.gif", 151, 362, 328, 398, "src/img/dhalsim/dhalsimDerrota1.gif", 1, 1, 1, 1, "src/img/dhalsim/dhalsimPose1.gif", 151, 362, 328, 398,"src/img/pantallas/dhalsimMap.gif","src/sound/dhalsimTheme.aiff",dhalsim);

        Peleador blanka1 = new Peleador("Blanka", "src/img/paises/brasil.png", 27, 1.84, 98, 22, 36, 32, "Hombre brasileño cuyo cuerpo ha sido infectado con demasiada clorofila proveniente de las selvas \r\n"
                + "donde vive. Es famoso por su movimiento especial eléctrico y sus movimientos rodantes.", "src/img/blanka/blankaAtaque1.gif", 100, 362, 444, 398, "src/img/blanka/blankaDefensa1.gif", 71, 358, 452, 425, "src/img/blanka/blankaDescanso1.gif", 94, 371, 385, 412, "src/img/blanka/blankaDerrota1.gif", 1, 1, 1, 1, "src/img/blanka/blankaPose1.gif", 151, 362, 328, 398,"src/img/pantallas/blankaMap.gif","src/sound/blankaTheme.aiff",blanka);

        Peleador vega1 = new Peleador("Vega", "src/img/paises/espana.png", 24, 1.86, 80, 28, 34, 28, "Luchador español contratado por Shadoloo que utiliza un estilo de lucha muy particular en el que \r\n"
                + "mezcla una rápida habilidad de esquiva parecida a la esgrima con una potente garra.", "src/img/vega/vegaAtaque1.gif", 0, 268, 713, 475, "src/img/vega/vegaDefensa1.gif", 151, 336, 328, 407, "src/img/vega/vegaDescanso1.gif", 151, 336, 328, 407, "src/img/vega/vegaDerrota1.gif", 1, 1, 1, 1, "src/img/vega/vegaPose1.gif", 151, 336, 328, 407,"src/img/pantallas/vegaMap.gif","src/sound/vegaTheme.aiff",vega);

        Peleador zangief1 = new Peleador("Zangief", "src/img/paises/urss.png", 44, 2.13, 160, 39, 36, 15, "Luchador ruso acostumbrado a entrenar con grandes osos. Es un luchador lento, pero si \r\n"
                + "logra agarrarte, estás acabado. Ingresa al evento por motivos económicos.","src/img/zangief/zangiefAtaque1.gif", 0, 351, 584, 409, "src/img/zangief/zangiefDefensa1.gif", 151, 362, 328, 420, "src/img/zangief/zangiefDescanso1.gif",151, 293, 328, 467, "src/img/zangief/zangiefDerrota1.gif", 1, 1, 1, 1, "src/img/zangief/zangiefPose1.gif", 151, 362, 328, 410,"src/img/pantallas/zangiefMap.gif","src/sound/zangiefTheme.aiff",zangief);

        Peleador deejay1 = new Peleador("Dee jay", "src/img/paises/jamaica.png", 31, 1.89, 87, 26, 25, 39, "Cantante que se interesó en un torneo de lucha como medio para ganar popularidad. Su fortaleza \r\n"
                + "viene de un desastre en un concierto que le hizo ganar una onda expansiva en sus puños.", "src/img/deejay/deejayAtaque1.gif", 115, 362, 408, 398, "src/img/deejay/deejayDefensa1.gif", 151, 362, 328, 398, "src/img/deejay/deejayDescanso1.gif", 151, 362, 328, 398, "src/img/deejay/deejayDerrota1.gif", 1, 1, 1, 1, "src/img/deejay/deejayPose1.gif", 151, 362, 328, 398,"src/img/pantallas/deejayMap.gif","src/sound/deejayTheme.aiff",deejay);

        Peleador thawk1 = new Peleador("T.Hawk", "src/img/paises/mexico.png", 39, 2.06, 112, 37, 31, 22, "Ingresa al torneo para vengar a sus compatriotas indios nativos, ya que Bison destruyó \r\n"
                + "su asentamiento por el oro y la cantidad de riquezas que poseían.", "src/img/thawk/thawkAtaque1.gif", 47, 328, 497, 432, "src/img/thawk/thawkDefensa1.gif", 151, 386, 328, 342, "src/img/thawk/thawkDescanso1.gif", 151, 362, 328, 398, "src/img/thawk/thawkDerrota1.gif", 1, 1, 1, 1, "src/img/thawk/thawkPose1.gif", 151, 362, 328, 340,"src/img/pantallas/thawkMap.gif","src/sound/thawkTheme.aiff",thawk);

        Peleador cammy1 = new Peleador("Cammy", "src/img/paises/reino_unido.png", 26, 1.68, 65, 12, 33, 45, "Tiene algunos lazos misteriosos con M.Bison, es una especialista de las fuerzas especiales del \r\n"
                + "ejército británico conocido como Delta Red.", "src/img/cammy/cammyAtaque1.gif", 79, 362, 500, 398, "src/img/cammy/cammyDefensa1.gif", 151, 362, 328, 398, "src/img/cammy/cammyDescanso1.gif", 151, 362, 328, 398, "src/img/cammy/cammyDerrota1.gif", 1, 1, 1, 1, "src/img/cammy/cammyPose1.gif", 151, 362, 328, 398,"src/img/pantallas/cammyMap.gif","src/sound/cammyTheme.aiff",cammy);

        Peleador balrog1 = new Peleador("Balrog", "src/img/paises/ee_uu.png", 35, 1.98, 118, 55, 16, 17, "Ex boxeador profesional que trabaja bajo las órdenes de M.Bison en la organización criminal de \r\n"
                + "Shadaloo. Lucha pura y exclusivamente con los puños.", "src/img/balrog/balrogAtaque1.gif", 51, 346, 547, 414, "src/img/balrog/balrogDefensa1.gif", 151, 362, 328, 414, "src/img/balrog/balrogDescanso1.gif", 20, 311, 488, 449, "src/img/balrog/balrogDerrota1.gif", 1, 1, 1, 1, "src/img/balrog/balrogPose1.gif", 151, 362, 328, 398,"src/img/pantallas/balrogMap.gif","src/sound/balrogTheme.aiff", balrog);

        Peleador sagat1 = new Peleador("Sagat", "src/img/paises/tailandia.png", 49, 2.25, 150, 35, 35, 20, "Integrante de Shadaloo, ingresa al torneo por venganza contra Ryu que años antes en una pelea le \r\n"
                + "causó la cicatriz que tiene en el pecho.", "src/img/sagat/sagatAtaque1.gif", 151, 323, 575, 437, "src/img/sagat/sagatDefensa1.gif", 151, 323, 328, 437, "src/img/sagat/sagatDescanso1.gif", 151, 323, 328, 437, "src/img/sagat/sagatDerrota1.gif", 1, 1, 1, 1, "src/img/sagat/sagatPose1.gif", 151, 323, 328, 437,"src/img/pantallas/sagatMap.gif","src/sound/sagatTheme.aiff",sagat);

        Peleador mbison1 = new Peleador("M.Bison", "src/img/paises/desconocido.png", 51, 2.10, 115, 37, 38, 25, "Líder de la organización criminal de Shadaloo. Es el organizador principal del torneo, aunque \r\n"
                + "realmente es una tapadera, es un contrabandista de armas y drogas cegado por el poder", "src/img/bison/bisonAtaque1.gif", 89, 217, 484, 543, "src/img/bison/bisonDefensa1.gif", 96, 149, 383, 611, "src/img/bison/bisonDescanso1.gif", 128, 326, 351, 434, "src/img/bison/bisonDerrota1.gif", 1, 1, 1, 1, "src/img/bison/bisonPose1.gif", 133, 362, 346, 398,"src/img/pantallas/bisonMap.gif","src/sound/bisonTheme.aiff",bison);


        Peleador ryu2 = new Peleador("Ryu", "Japon", 26, 1.75, 85, 27, 32, 31, "Luchador entrenado por Gouken famoso por su potente Hadoken, golpe ganador con el que \r\n"
                + "derrotó a Sagat en el primer torneo y lo hirió gravemente.", "src/img/ryu/ryuAtaque2.gif", 554, 334, 408, 426, "src/img/ryu/ryuDefensa2.gif", 554, 379, 408, 381, "src/img/ryu/ryuDescanso2.gif", 554, 379, 408, 381, "src/img/ryu/RyuDerrota2.gif", 0, 362, 479, 398, "src/img/ryu/ryuPose2.gif", 554, 379, 408, 381,"src/img/pantallas/ryuMap.gif","src/sound/ryuTheme.aiff",ryu_2);

        Peleador ken2 = new Peleador("Ken", "EE.UU", 25, 1.75, 86, 28, 30, 32, "Descendiente de una rica familia estadounidense, su padre pagó para formarle en kárate. \r\n"
                + "Discípulo de Gouken igual que Ryu pretende ser el mejor luchador del mundo, por encima de Ryu.", "src/img/ken/kenAtaque2.gif", 453, 318, 481, 483, "src/img/ken/kenDefensa2.gif", 489, 172, 473, 629, "src/img/ken/kenDescanso2.gif", 531, 332, 431, 469, "src/img/ken/kenDerrota2.gif", 0, 362, 479, 398, "src/img/ken/kenPose2.gif", 554, 329, 408, 472,"src/img/pantallas/kenMap.gif","src/sound/kenTheme.aiff",ken_2);

        Peleador chunli2 = new Peleador("Chun-Li", "China", 19, 1.65, 58, 18, 21, 51, "Artista marcial experta y oficial de la Interpol. Sin descanso, ella busca venganza por la muerte de \r\n"
                + "su padre a manos del líder de la organización criminal Shadaloo, M.Bison.", "src/img/chun-li/chunliAtaque2.gif", 445, 317, 517, 443, "src/img/chun-li/chunliDefensa2.gif", 554, 379, 408, 381, "src/img/chun-li/chunliDescanso2.gif", 554, 379, 408, 381, "src/img/chun-li/chunliDerrota2.gif", 1, 1, 1, 1, "src/img/chun-li/chunliPose2.gif", 554, 379, 408, 381,"src/img/pantallas/chunliMap.gif","src/sound/chunliTheme.aiff",chunli_2);

        Peleador guile2 = new Peleador("Guile", "EE.UU", 42, 1.85, 100, 34, 23, 33, "Ingresa al torneo para poner a M.Bison bajo custodia por ser el asesino de su mejor amigo Charlie, \r\n"
                + "solo la victoria sobre el mismo le hará enfrentarse a él y poder derrotarlo.", "src/img/guile/guileAtaque2.gif", 389, 362, 508, 396, "src/img/guile/guileDefensa2.gif", 554, 379, 408, 381, "src/img/guile/guileDescanso2.gif", 554, 379, 408, 381, "src/img/guile/guileDerrota2.gif", 1, 1, 1, 1, "src/img/guile/guilePose2.gif", 554, 379, 408, 381,"src/img/pantallas/guileMap.gif","src/sound/guileTheme.aiff",guile_2);

        Peleador honda2 = new Peleador("Honda", "Japon", 40, 1.89, 170, 46, 26, 18, "Luchador de sumo profesional de Japón que entra al torneo para demostrar que el sumo es el \r\n"
                + "mejor estilo de lucha del mundo por lo que retará a todo el que pretenda enfrentarse a él.", "src/img/honda/hondaAtaque2.gif", 338, 362, 624, 398, "src/img/honda/hondaDefensa2.gif", 489, 373, 473, 387, "src/img/honda/hondaDescanso2.gif", 338, 294, 624, 466, "src/img/honda/hondaDerrota2.gif", 1, 1, 1, 1, "src/img/honda/hondaPose2.gif", 554, 420, 408, 340,"src/img/pantallas/hondaMap.gif","src/sound/hondaTheme.aiff",honda_2);

        Peleador dhalsim2 = new Peleador("Dhalsim", "India", 58, 1.76, 65, 24, 32, 34, "Pacifista pero entró a un torneo de lucha para recaudar dinero para su aldea empobrecida. Ha \r\n"
                + "dedicado su vida a la meditación lo que le permite expulsar fuego por la boca y estirar su cuerpo.", "src/img/dhalsim/dhalsimAtaque2.gif", 300, 259, 662, 542, "src/img/dhalsim/dhalsimDefensa2.gif", 389, 329, 573, 472, "src/img/dhalsim/dhalsimDescanso2.gif", 554, 329, 408, 472, "src/img/dhalsim/dhalsimDerrota2.gif", 1, 1, 1, 1, "src/img/dhalsim/dhalsimPose2.gif", 554, 329, 408, 472,"src/img/pantallas/dhalsimMap.gif","src/sound/dhalsimTheme.aiff",dhalsim_2);

        Peleador blanka2 = new Peleador("Blanka", "Brasil", 27, 1.84, 98, 22, 36, 32, "Hombre brasileño cuyo cuerpo ha sido infectado con demasiada clorofila proveniente de las selvas \r\n"
                + "donde vive. Es famoso por su movimiento especial eléctrico y sus movimientos rodantes.", "src/img/blanka/blankaAtaque2.gif", 359, 329, 603, 472, "src/img/blanka/blankaDefensa2.gif", 445, 329, 517, 472, "src/img/blanka/blankaDescanso2.gif", 554, 329, 408, 472, "src/img/blanka/blankaDerrota2.gif", 1, 1, 1, 1, "src/img/blanka/blankaPose2.gif", 554, 329, 408, 472,"src/img/pantallas/blankaMap.gif","src/sound/blankaTheme.aiff",blanka_2);

        Peleador vega2 = new Peleador("Vega", "España", 24, 1.86, 80, 28, 34, 28, "Luchador español contratado por Shadoloo que utiliza un estilo de lucha muy particular en el que \r\n"
                + "mezcla una rápida habilidad de esquiva parecida a la esgrima con una potente garra.", "src/img/vega/vegaAtaque2.gif", 270, 239, 692, 562, "src/img/vega/vegaDefensa2.gif", 554, 278, 408, 523, "src/img/vega/vegaDescanso2.gif", 554, 278, 408, 523, "src/img/vega/vegaDerrota2.gif", 1, 1, 1, 1, "src/img/vega/vegaPose2.gif", 554, 278, 408, 523,"src/img/pantallas/vegaMap.gif","src/sound/vegaTheme.aiff",vega_2);

        Peleador zangief2 = new Peleador("Zangief", "Union Sovietica", 44, 2.13, 160, 39, 36, 15, "Luchador ruso acostumbrado a entrenar con grandes osos. Es un luchador lento, pero si \r\n"
                + "logra agarrarte, estás acabado. Ingresa al evento por motivos económicos.","src/img/zangief/zangiefAtaque2.gif", 457, 328, 505, 473, "src/img/zangief/zangiefDefensa2.gif", 554, 329, 408, 472, "src/img/zangief/zangiefDescanso2.gif",554, 239, 408, 562, "src/img/zangief/zangiefDerrota2.gif", 1, 1, 1, 1, "src/img/zangief/zangiefPose2.gif", 554, 329, 408, 472,"src/img/pantallas/zangiefMap.gif","src/sound/zangiefTheme.aiff",zangief_2);

        Peleador deejay2 = new Peleador("Dee jay", "Jamaica", 31, 1.89, 87, 26, 25, 39, "Cantante que se interesó en un torneo de lucha como medio para ganar popularidad. Su fortaleza \r\n"
                + "viene de un desastre en un concierto que le hizo ganar una onda expansiva en sus puños.", "src/img/deejay/deejayAtaque2.gif", 397, 330, 565, 471, "src/img/deejay/deejayDefensa2.gif", 554, 329, 408, 472, "src/img/deejay/deejayDescanso2.gif", 554, 329, 408, 472, "src/img/deejay/deejayDerrota2.gif", 1, 1, 1, 1, "src/img/deejay/deejayPose2.gif", 554, 329, 408, 472,"src/img/pantallas/deejayMap.gif","src/sound/deejayTheme.aiff",deejay_2);

        Peleador thawk2 = new Peleador("T.Hawk", "Mexico", 39, 2.06, 112, 37, 31, 22, "Ingresa al torneo para vengar a sus compatriotas indios nativos, ya que Bison destruyó \r\n"
                + "su asentamiento por el oro y la cantidad de riquezas que poseían.", "src/img/thawk/thawkAtaque2.gif", 366, 315, 596, 486, "src/img/thawk/thawkDefensa2.gif", 554, 329, 408, 474, "src/img/thawk/thawkDescanso2.gif", 554, 329, 408, 472, "src/img/thawk/thawkDerrota2.gif", 1, 1, 1, 1, "src/img/thawk/thawkPose2.gif", 554, 329, 408, 474,"src/img/pantallas/thawkMap.gif","src/sound/thawkTheme.aiff",thawk_2);

        Peleador cammy2 = new Peleador("Cammy", "Reino Unido", 26, 1.68, 65, 12, 33, 45, "Tiene algunos lazos misteriosos con M.Bison, es una especialista de las fuerzas especiales del \r\n"
                + "ejército británico conocido como Delta Red.", "src/img/cammy/cammyAtaque2.gif", 360, 322, 602, 479, "src/img/cammy/cammyDefensa2.gif", 554, 300, 408, 501, "src/img/cammy/cammyDescanso2.gif", 554, 329, 408, 472, "src/img/cammy/cammyDerrota2.gif", 1, 1, 1, 1, "src/img/cammy/cammyPose2.gif", 554, 329, 408, 472,"src/img/pantallas/cammyMap.gif","src/sound/cammyTheme.aiff",cammy_2);

        Peleador balrog2 = new Peleador("Balrog", "EE.UU", 35, 1.98, 118, 55, 16, 17, "Ex boxeador profesional que trabaja bajo las órdenes de M.Bison en la organización criminal de \r\n"
                + "Shadaloo. Lucha pura y exclusivamente con los puños.", "src/img/balrog/balrogAtaque2.gif", 362, 314, 600, 487, "src/img/balrog/balrogDefensa2.gif", 554, 329, 408, 472, "src/img/balrog/balrogDescanso2.gif", 470, 305, 492, 496, "src/img/balrog/balrogDerrota2.gif", 1, 1, 1, 1, "src/img/balrog/balrogPose2.gif", 554, 300, 408, 501,"src/img/pantallas/balrogMap.gif","src/sound/balrogTheme.aiff",balrog_2);

        Peleador sagat2 = new Peleador("Sagat", "Tailandia", 49, 2.25, 150, 35, 35, 20, "Integrante de Shadaloo, ingresa al torneo por venganza contra Ryu que años antes en una pelea le \r\n"
                + "causó la cicatriz que tiene en el pecho.", "src/img/sagat/sagatAtaque2.gif", 338, 298, 624, 503, "src/img/sagat/sagatDefensa2.gif", 531, 298, 431, 503, "src/img/sagat/sagatDescanso2.gif", 531, 298, 431, 503, "src/img/sagat/sagatDerrota2.gif", 1, 1, 1, 1, "src/img/sagat/sagatPose2.gif", 531, 298, 431, 503,"src/img/pantallas/sagatMap.gif","src/sound/sagatTheme.aiff",sagat_2);

        Peleador mbison2 = new Peleador("M.Bison", "Desconocido", 51, 2.10, 115, 37, 38, 25, "Líder de la organización criminal de Shadaloo. Es el organizador principal del torneo, aunque \r\n"
                + "realmente es una tapadera, es un contrabandista de armas y drogas cegado por el poder", "src/img/bison/bisonAtaque2.gif", 460, 206, 502, 562, "src/img/bison/bisonDefensa2.gif", 515, 133, 447, 635, "src/img/bison/bisonDescanso2.gif", 576, 279, 386, 522, "src/img/bison/bisonDerrota2.gif", 1, 1, 1, 1, "src/img/bison/bisonPose2.gif", 576, 311, 386, 490,"src/img/pantallas/bisonMap.gif","src/sound/bisonTheme.aiff",bison_2);

        peleador1.add(ryu1);
        peleador1.add(ken1);
        peleador1.add(chunli1);
        peleador1.add(guile1);
        peleador1.add(honda1);
        peleador1.add(dhalsim1);
        peleador1.add(zangief1);
        peleador1.add(blanka1);
        peleador1.add(cammy1);
        peleador1.add(thawk1);
        peleador1.add(deejay1);
        peleador1.add(balrog1);
        peleador1.add(vega1);
        peleador1.add(sagat1);
        peleador1.add(mbison1);

        peleador2.add(ryu2);
        peleador2.add(ken2);
        peleador2.add(chunli2);
        peleador2.add(guile2);
        peleador2.add(honda2);
        peleador2.add(dhalsim2);
        peleador2.add(zangief2);
        peleador2.add(blanka2);
        peleador2.add(cammy2);
        peleador2.add(thawk2);
        peleador2.add(deejay2);
        peleador2.add(balrog2);
        peleador2.add(vega2);
        peleador2.add(sagat2);
        peleador2.add(mbison2);
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load(R.drawable.portada)
                .into(imageView);
        for (int i = 0; i < peleador1.size(); i++) {
            final int finalI = i; // Variable final para usar en el OnClickListener
            peleador1.get(i).getboton().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Obtenemos el nombre de la variable ImageView
                    String imageViewName = getResources().getResourceEntryName(peleador1.get(finalI).getboton().getId());
                    luchador1 = peleador1.get(finalI);
                    for(int i = 0; i<peleador1.size();i++){
                        peleador1.get(i).getboton().setVisibility(View.INVISIBLE);
                    }
                    for(int i = 0; i<peleador2.size();i++){
                        peleador2.get(i).getboton().setVisibility(View.INVISIBLE);
                    }
                    ImageView imageView = findViewById(R.id.inicio_pelea);
                    imageView.setVisibility(View.VISIBLE);
                }
            });
        }
        for (int i = 0; i < peleador2.size(); i++) {
            final int finalI = i; // Variable final para usar en el OnClickListener
            peleador2.get(i).getboton().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Obtenemos el nombre de la variable ImageView
                    String imageViewName = getResources().getResourceEntryName(peleador2.get(finalI).getboton().getId());
                    luchador2 = peleador2.get(finalI);
                    for(int i = 0; i<peleador2.size();i++){
                        peleador2.get(i).getboton().setVisibility(View.INVISIBLE);
                    }
                }
            });
        }

    }
    public void inic(View view){
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load(R.drawable.fondo)
                .into(imageView);
        ImageView star = findViewById(R.id.start);
        Glide.with(this)
                .load(R.drawable.start)
                .into(imageView);
    }
    public void start(View view){
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load(R.drawable.mapa_mundi)
                .into(imageView);
        for(int i = 0; i<peleador1.size();i++){
            peleador1.get(i).getboton().setVisibility(View.VISIBLE);
        }
    }
    public void inicio_pelea(View view){
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load(R.drawable.ryumap)
                .into(imageView);
        ImageView comabtiente1 = findViewById(R.id.comabtiente1);
        Glide.with(this)
                .load(R.drawable.ryupose1)
                .into(comabtiente1);
        ImageView comabtiente2 = findViewById(R.id.comabtiente2);
        Glide.with(this)
                .load(R.drawable.kenpose2)
                .into(comabtiente2);
    }

}
