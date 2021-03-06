/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015-2017 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.almasb.fxgl.physics;

import com.almasb.fxgl.ecs.AbstractComponent;
import com.almasb.fxgl.ecs.component.Required;
import com.almasb.fxgl.entity.component.BoundingBoxComponent;
import com.almasb.fxgl.entity.component.PositionComponent;
import javafx.scene.paint.Color;
import org.jbox2d.particle.ParticleGroupDef;

/**
 * Adds physics particle properties to an entity.
 * By setting the definition each property can be fine-tuned.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
@Required(PositionComponent.class)
@Required(BoundingBoxComponent.class)
public class PhysicsParticleComponent extends AbstractComponent {
    private ParticleGroupDef definition = new ParticleGroupDef();
    private Color color = Color.BLACK;

    /**
     * Set particle group definition.
     *
     * @param definition particle definition
     */
    public void setDefinition(ParticleGroupDef definition) {
        this.definition = definition;
    }

    /**
     * @return definition
     */
    public ParticleGroupDef getDefinition() {
        return definition;
    }

    /**
     * Set particle color.
     *
     * @param color particle color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return particle color
     */
    public Color getColor() {
        return color;
    }
}
