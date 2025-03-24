onerror {quit -f}
vlib work
vlog -work work DECODER3_5.vo
vlog -work work DECODER3_5.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.DECODER3_5_vlg_vec_tst
vcd file -direction DECODER3_5.msim.vcd
vcd add -internal DECODER3_5_vlg_vec_tst/*
vcd add -internal DECODER3_5_vlg_vec_tst/i1/*
add wave /*
run -all
