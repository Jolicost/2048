/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio.PartidaView.Fletxa;

import java.awt.event.ActionListener;

/**
 *
 * @author JOAN
 */
public class Dreta extends Fletxa{
    private static final String TipusMov = "Dreta";

    public Dreta(ActionListener Moure[]) {
        super(Moure);
    }

    @Override
    public String getTipusMov() {
        return TipusMov;
    }

    @Override
    public float getRotacio() {
        return 90;
    }
}
