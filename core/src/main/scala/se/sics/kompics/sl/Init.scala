/*
 * This file is part of the Kompics component model runtime.
 *
 * Copyright (C) 2009 Swedish Institute of Computer Science (SICS)
 * Copyright (C) 2009 Royal Institute of Technology (KTH)
 *
 * Kompics is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package se.sics.kompics.sl

/**
 * The <code>Init</code> case class.
 *
 * @author Lars Kroll {@literal <lkroll@kth.se>}
 * @version $Id: $
 */
case class Init[T <: ComponentDefinition](params: Any*) extends se.sics.kompics.Init[T]

object Init {
  /**
   * Reference to se.sics.kompics.Init.NONE.
   *
   * Use in <code>create</code> calls.
   */
  val NONE = se.sics.kompics.Init.NONE;
  /**
   * Cast reference to <code>se.sics.kompics.Init.NONE</code>.
   *
   * Use in abstractions that expect an instance of <code>se.sics.kompics.Init[T]</code>.
   *
   */
  def none[T <: se.sics.kompics.ComponentDefinition]: se.sics.kompics.Init[T] = se.sics.kompics.Init.NONE.asInstanceOf[se.sics.kompics.Init[T]];
}
