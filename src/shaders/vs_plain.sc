$input a_position

/*
 * Copyright 2014-2015 Dario Manesku. All rights reserved.
 * License: http://www.opensource.org/licenses/BSD-2-Clause
 */

#include "shader.shdr"

void main()
{
    gl_Position = mul(u_modelViewProj, vec4(a_position, 1.0));
}

/* vim: set sw=4 ts=4 expandtab: */
