onerror {quit -f}
vlib work
vlog -work work D_FF2.vo
vlog -work work D_FF2.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.D_FF2_vlg_vec_tst
vcd file -direction D_FF2.msim.vcd
vcd add -internal D_FF2_vlg_vec_tst/*
vcd add -internal D_FF2_vlg_vec_tst/i1/*
add wave /*
run -all
